package arrays;

public class CountOccurrence {
    public static void main(String[] args) {
        char[][] letters = {
                {'a', 'b', 'c'},
                {'d', 'a', 'f'},
                {'g', 'h', 'a'}
        };
        int count = 0;
        for(int i=0;i< letters.length;i++) {

            for(int j=0;j<letters[i].length;j++) {
                if(letters[i][j] == 'a') {
                    count++;
                }
            }
        }
        System.out.println("Letters a occurred:"+count);
    }
}
