import java.util.*;
class j6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<n;i++){
        if(i%5==0 && i%3==0){
            System.out.println(i+" is divisible by 3 and 5 both");
        }
    }
}
}