import java.util.*;
class j2{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int sum=0;
    int reverse=0;
    while (number !=0){
        sum += number%10;
        reverse = (reverse*10) + number%10;
        number /=10;
    }
    System.out.println(sum+" "+reverse);
}
}