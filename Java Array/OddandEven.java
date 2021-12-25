
public class Print_OddandEven {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8};
        int i,n = 7;

        //loop for printing even elements
        System.out.println("Even elements are:");
        for(i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        //loop for printing odd elements
        System.out.println("Odd elements are:");
        for(i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
