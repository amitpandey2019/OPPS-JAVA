import java.util.*;
class j8{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result=1;
    for(int i=0;i<n;i++){
        result *= n-i;
    }
    System.out.println(result);
}
}