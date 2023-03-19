
import java.util.Random;

public class CountLettersInArr {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("Random letters are: ");
        disPlayArray(chars);
        int counts[] = countLetters(chars);
        System.out.println();
        System.out.println("The occurenecs are :");
        displayCount(counts);
    }
    public static char[] createArray() {
        char[] chars = new char[27];

        for(int i = 0; i < chars.length; i++) {
            Random r = new Random();
            chars[i] = (char)(r.nextInt(26) + 'a');
        }

        return chars;
    }

    public static void disPlayArray(char[] chars) {
        for(int i = 0; i < chars.length; i++){
            if((i+1) % 20 == 0) {
                System.out.println(chars[i]);
            }
            else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
    // so over here you declare an array of counter instead of 26 counter variables
        int counts[] = new int[26];

        for(int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCount(int[] counts) {
        for(int i = 0; i < counts.length; i++){
            if((i+1)%10 == 0){
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            }
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    } 
}
