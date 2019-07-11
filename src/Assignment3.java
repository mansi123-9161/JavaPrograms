import java.util.Scanner;

public class Assignment3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a' ||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            {
                System.out.print("vowel ");
            }
            else
            {
                System.out.print("consonent ");
            }
        }

    }
}