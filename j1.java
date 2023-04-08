import java.util.Scanner;
class j1{
    public static void main(String args[]){
        final double pi= 3.14;
        System.out.println("Type Radius of Circle");
        Scanner obj = new Scanner(System.in);
        int radius = obj.nextInt();
        double result = pi*radius*radius;
        System.out.println("Area of Circle is "+result);
    }
}