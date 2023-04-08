import java.util.Scanner;

class tollplaza{
    public static void main(String[] args) {
        boolean value = true;
        int carCount=0;
        int taxCollected=0;
        while(value){
            Scanner sc = new
            Scanner(System.in);
            System.out.println("Is car is VIP? type 1 for yes");
            int isVIP = sc.nextInt();
            switch(isVIP)
            {
                case 1:System.out.println("You can Go");
                break;
                default:System.out.println("Pay Rs 10/-");
                taxCollected +=10;
            }
            carCount++;

            System.out.println("Amount Collected Till Now is:"+taxCollected+"/-Rs");
            System.out.println("Total Car Passed Till Now is:"+caeCount+");
            System.out.println("Do you want to Stop(Type 1 to stop)");
            if(sc.nextInt()==1){
                value = false;
            }
    }
}