package Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CompareCSV
{
  public static void main(String args[]) throws IOException
  {
    String path="/Users/k0r009y/Documents/cvp/Examples/src/main/resources/ProdConfigData/";
    String file1="AZcvp_user_202403151657.csv";
    String file2="INcvp_user_202403151712.csv";
    String file3="diff.csv";
    ArrayList al1=new ArrayList();
    ArrayList al2=new ArrayList();


    BufferedReader CSVFile1 = new BufferedReader(new FileReader(path+file1));
    String dataRow1 = CSVFile1.readLine();
    while (dataRow1 != null)
    {
      String[] dataArray1 = dataRow1.split(",");
      al1.addAll(Arrays.asList(dataArray1));

      dataRow1 = CSVFile1.readLine();
    }

    CSVFile1.close();

    BufferedReader CSVFile2 = new BufferedReader(new FileReader(path+file2));
    String dataRow2 = CSVFile2.readLine();
    while (dataRow2 != null)
    {
      String[] dataArray2 = dataRow2.split(",");
      al2.addAll(Arrays.asList(dataArray2));
      dataRow2 = CSVFile2.readLine();
    }
    CSVFile2.close();

    for(Object bs:al2)
    {
      al1.remove(bs);
    }

    int size=al1.size();
    System.out.println(size);

    try
    {
      FileWriter writer=new FileWriter(path+file3);
      while(size!=0)
      {
        size--;
        writer.append("").append(String.valueOf(al1.get(size)));
        writer.append('\n');
      }
      writer.flush();
      writer.close();
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }

}
