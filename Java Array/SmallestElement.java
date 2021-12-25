public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,8,9};
        int i, min = arr[0];
        int length = arr.length;
        for(i=0;i<length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest element of the array is:" + min);
    }
}
