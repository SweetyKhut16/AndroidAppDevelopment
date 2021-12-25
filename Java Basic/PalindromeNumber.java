import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        //Taking a input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check:");

        //Assigning variables
        int num = input.nextInt();
        int reverse =0;
        int rem;
        int num1 = num;
      
        //To extract the last digit and forming the reverse number
        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        //Comparing the original with the reverse number to check
        if(num1 == reverse){
            System.out.println("Given number is Palindrome Number");
        }
        else{
            System.out.println("Given number is not Palindrome Number");
        }
    }
}
