package Exp;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Base64;

public class DownloadImage
{
    private static byte[] downloadImages(String imageUrl)  {
        HttpResponse<InputStream> response = null;
        try {
            HttpClient client = HttpClient.newHttpClient(); //connection pool
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(imageUrl))
                    .GET()
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (response.statusCode() == 200) {
            try (InputStream inputStream = response.body();
                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                return outputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("Failed to download image. HTTP Code: " + response.statusCode());
        }
    }

    private static byte[] createPdfFromImage(byte[] imageBytes) throws IOException {
        PDDocument document = new PDDocument();

        PDPage page = new PDPage();
        document.addPage(page);
        PDImageXObject pdImage = PDImageXObject.createFromByteArray(document, imageBytes, "fedexLabelImage.png");
        PDPageContentStream contentStream = new PDPageContentStream(document, page); //Add it in Try block
        contentStream.drawImage(pdImage, 0, 0, page.getMediaBox().getWidth(), page.getMediaBox().getHeight());

        //Testing purpose
      //  document.save("target/pdfOutputFile.pdf");
      //  System.out.println("PDF created successfully.");

        contentStream.close(); //No need

        ByteArrayOutputStream pdfOutputStream = new ByteArrayOutputStream();
        document.save(pdfOutputStream);
        document.close(); //No need

        return pdfOutputStream.toByteArray();
    }

    public static void main(String[] args) throws IOException {
        byte[] imageDownloaded = downloadImages("https://i5.walmartimages.com/asr/32b42f52-f2d2-4f69-b833-9a25c7c40ea5.62846fea4c0e22bc2b293b3e29f6c100.png");
        byte[] createPdfFromImage = createPdfFromImage(imageDownloaded);

        String base64EncodedPdfData = Base64.getEncoder().encodeToString(createPdfFromImage);
        System.out.println(base64EncodedPdfData);
    }
}
