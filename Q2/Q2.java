public class Q2 {
    public static int stair(int n){
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(stair(n));
        
    }
    
}