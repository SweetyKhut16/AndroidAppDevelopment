import java.util.Scanner;
import java.lang.String;

public class CharacterCount {
    public static void main(String[] args) {
        
      //Taking Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s = input.nextLine();
        
      //Assigning variables
        int i;
        int count =0;
        int length = s.length();
        
      //Counting the characters of string
        for(i=0;i<length;i++){
            //checking if it has space
            if(s.charAt(i) !=' '){
                count++;
            }
        }
        //System.out.println(length);
        System.out.println(count);
    }
}
