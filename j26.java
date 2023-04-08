class j26 extends Exception{
    j26(String str){
        super(str);
    }
    public static void main(String args[]){
        int percent= 74;
        try{
            if(percent<75){
                throw new j26("Exception Attandance is low");
            }
            else{
                System.out.println("All ok");
            }
        }
        catch(j26 e){
            System.out.println("Exception occured : "+e);
        }
        finally{
            System.out.println("Finally Block, Connection Closed.");
        }
    }
}