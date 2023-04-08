import java.util.*;  
class CalculateElectricityBill{ 
    static int billToPay;  
    static int getBill(int units){ 
        if(units <= 100){  
            billToPay = units*2;  
        } 
        else if(units <= 300){  
            billToPay = 100*2+(units - 100)*5;  
        }
        else if(units <= 500){  
            billToPay = 100*2+200*5+(units - 300)*6;  
        }
        else if(units > 500){  
            billToPay = 100*2+200*5+200*6+(units - 500)*8;  
        }    
        return billToPay;  
    }      
}  
class j20 extends CalculateElectricityBill  
{
    public static void main(String args[]){       
        int units;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units for calculating electricity bill.");  
        units = sc.nextInt();
        System.out.println("The electricity bill for "+units+" Units is: Rs" + getBill(units));   
    }   
}  
