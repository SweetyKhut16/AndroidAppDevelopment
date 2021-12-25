import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Taking Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter till how many digits you want the series:");

        //Assigning Variables
        int digit = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3,i;
       //Printing the first two fixed number of series
        System.out.println(n1);
        System.out.println(n2);
        //printing the series starting from third number
        for (i=2;i<digit;i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;

        }
    }
}
