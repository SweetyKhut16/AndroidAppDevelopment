import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        System.out.println("Enter a four digit number to check:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = ((num*2)%1000)/10;

        //System.out.println(n%10);
        //System.out.println(n/10);
        if(n%10 == n/10){
            System.out.println("Given number is Strontio Number");
        }
        else{
            System.out.println("Given number is not Strontio number");
        }


    }
}
