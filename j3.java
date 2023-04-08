import java.util.*;
class j3{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    number1 = number1+number2;
    number2 = number1-number2;
    number1 = number1-number2;
    System.out.println(number1+" "+number2);
}
}