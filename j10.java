import java.util.*;
class j10{
    public static int reverseNumber(int number){
        int reverse=0;
        while (number !=0){
        reverse = (reverse*10) + number%10;
        number /=10;
    }
        return reverse;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int reverse= reverseNumber(number);

    if(number == reverse){
        System.out.println("It is a Palindrome Number");
    }
    else{
        System.out.println("Not a Palindrome!!");
    }
}
}