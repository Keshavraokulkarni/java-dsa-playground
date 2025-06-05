package STRING;

public class StringBuilderExample {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "awesome!"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++) {
            sb.append(words[i]+" ");
        }
        System.out.println("print StringBuilder: "+sb);
    }
}
