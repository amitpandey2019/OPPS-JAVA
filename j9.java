import java.util.*;
class j9{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a=1;
    int b=2;
    int sum=0;
    System.out.print("1 2 ");
    for(int i =2; i<n;i++){
        sum=a+b;
        a=b;
        b=sum;
        System.out.print(sum+" ");
    }
}
}