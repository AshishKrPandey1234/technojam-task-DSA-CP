public class Q1 {
    public static void generatePascalTriangle(int n) {
        //write your code here
        int pascal[][]=new int[n][n];
        for(int i=0;i<n;i++){
            //first and last element of each row is always 1
            pascal[i][0]=1;
            pascal[i][i]=1;
            //fill the value in between
            for(int j=1;j<i;j++){
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        //print pascal triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}