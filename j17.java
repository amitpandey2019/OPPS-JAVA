import java.util.*;
class j17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[40];
        int index=0;
        int number = sc.nextInt();
        int count=0;
        while(number>0){
            arr[index++] = number%2; 
            number /=2;
            // System.out.print("["+index+"]");
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}