import java.util.*;
class j16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
            // System.out.print(i+","+j+"\t");
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}