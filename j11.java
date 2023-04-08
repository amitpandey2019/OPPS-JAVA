import java.util.*;
class j11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Value of a and b");  
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result=0;
        for(int i = 1; i <= first || i<=second;i++ ){
            if(first%i ==0 && second%i == 0){
                result = i;
            }
        }
        System.out.println("HCF is "+result);
    }
}