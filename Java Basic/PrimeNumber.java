import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 2; i < num; i++) {

            if(num%i == 0){
                System.out.println("Given number is not prime");
            }
            else{
                System.out.println("Given number is prime number");
            }
            break;
        }
    }
}
