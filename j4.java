import java.util.*;
class j4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type amount, time, interest percent");
        float amt = sc.nextFloat();
        int time = sc.nextInt();
        float interest = sc.nextFloat();
        float result = time*amt*interest/100f;
        System.out.println("Simple interest is "+result);
    }
}