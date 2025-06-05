package arrays;

public class JaggedArrayWordBuilder {
    public static void main(String[] args) {

        String[][] words = {
                {"apple", "banana"},
                {"carrot"},
                {"dog", "elephant", "fish"}
        };

        System.out.println("Reverse order:");
        for(int i=words.length-1;i >= 0 ;i--) {

            for(int j=words[i].length-1;j >= 0;j--) {
                System.out.println(words[i][j]);
            }
        }

        System.out.println("Normal order:");
        for(int i=0;i< words.length;i++) {

            for(int j=0;j<words[i].length;j++) {
                System.out.println(words[i][j]);
                }
            }
        }
    }
