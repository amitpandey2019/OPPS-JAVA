import java.util.*;

class j7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double x,y;
        double determinant = (b*b)-(4*a*c);
        if(determinant !=0){
            x= (-b + Math.sqrt(determinant)) / (2 * a);
            y= (-b - Math.sqrt(determinant)) / (2 * a);
        }
        else{
            x = y = -b/2*a;
        }
        System.out.println(x+" "+y);


    }
}