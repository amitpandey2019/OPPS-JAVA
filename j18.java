import java.util.*;
class j18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<count;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("MIN is "+min+" and MAX is "+max);
    }
}