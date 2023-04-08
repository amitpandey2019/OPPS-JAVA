import java.util.*;
class j12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double sum=0.0;
        System.out.println("Type Value of N");     
        int n = sc.nextInt();
        for(double i=1;i<=n;i++){
            sum += 1/i;
            // System.out.print("\t"+sum);
        }
        System.out.println("result is "+sum);
    }
}