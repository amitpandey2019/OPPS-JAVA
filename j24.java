class j24{
    public static void main(String args[]){
        int number= 10;
        try{
            number /=0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured : "+e);
        }
        finally{
            System.out.println("Finally Block, Connection Closed.");
        }
    }
}