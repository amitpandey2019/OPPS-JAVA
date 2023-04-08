import java.util.*;
class j25 extends Exception{
    j25(String str){
        super(str);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int percent= sc.nextInt();
        try{
            if(percent>=0 && percent<75){
                throw new j25("Exception Attandance is low");
            }
            else if(percent<0){
                throw new ArithmeticException("Percentage cannot be negative");
            }
            else{
                System.out.println("All ok");
            }
        }
        catch(j25 e){
            System.out.println("Exception occured : "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured : "+e);
        }
        finally{
            System.out.println("Finally Block, Connection Closed.");
        }
    }
}