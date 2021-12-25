public class MatrixAddition {
    public static void main(String[] args) {
    
        //Assigning values to the matrices
        int[][] a = {{1,2},{4,5}};
        int[][] b = {{6,4},{2,9}};
        int[][] c = new int[2][2];
        int i,j = 0;
        //using for loop to add each element
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                c[i][j] = a[i][j]+b[i][j];
                //printing a new matrix
                System.out.println(c[i][j]);
            }
        }
    }
}
