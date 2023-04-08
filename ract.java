[2:32 PM, 1/17/2023] Amit pandey: import java.util.*;
class test1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        int min1=arr[0],min2=arr[0];
        for(int i =0; i<size; i++){
            
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
}
[2:32 PM, 1/17/2023] Varun Mru: import java.util.*;
class Ractangle{
    int length;
    int breadth;
    public int calculateParameter(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
        return 2*(length+breadth);
    }
} 
public class ParameterCalculator extends Ractangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Ractangle r1 = new Ractangle();
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        System.out.println("Parameter of Ractangle is "+r1.calculateParameter(length,breadth));
    }

    
}