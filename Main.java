import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) {
            int l=i;
            for(int j=i;j<=n-1;j++){
                System.out.println(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(1+" ");
                l++;
            }
            int k=l-2;
            for(int a=2;a<=i;a++)
            {
                {System.out.println(k+" ");
            k--;
        }
            }
            System.out.println();
        }
    }
}
