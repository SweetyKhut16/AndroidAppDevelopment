import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        //Taking Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter thr number to check");
        int num = input.nextInt();

        //Initializing The variables
        int sum = 0 , product = 1;

        //Using loop to add and multiply digits
        while(num!=0){
            int a = num%10;
            sum = sum + a;
            product = product * a;
            num = num/10;
        }
        //Checking if number is spy number
        if(sum == product){
            System.out.println("Given number is spy number");
        }
        else{
            System.out.println("Given number is not spy number");
        }

    }
}
