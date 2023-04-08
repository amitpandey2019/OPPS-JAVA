import java.util.*;
class test1{
    public static void main(String arge[])
    Scanner sc = new
    Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i =0; i<size;i++){
arr[i] = sc..nextInt();
    }
    int min1=arr[0],min2=arr[0];
    for(int i =0; i<size;i++){
        if(arr[i]<min1){
            min2 = min1;
            min1 = arr[i];
        }
        else if(arr[i]<min2){
            min2 = arr[i];
        }
    }
    System.out.println("2nd min : "+min2);
    System.out.println("min : "+min1);
}
