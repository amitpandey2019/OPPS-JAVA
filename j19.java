class j19{
    int  id;
    String name;
    j19(){
        id=0;
        name="Deafult Name";
        System.out.println("Id is "+id+" Name is "+name);
    }
    j19(int id){
        this.id=id;
        name = "No Name Recieved";
        System.out.println("Id is "+id+" Name is "+name);
    }
    j19(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Id is "+id+" Name is "+name);
    }
    public static void main(String args[]){
        j19 obj1 = new j19(); //Default Constructor will be called;
        j19 obj2 = new j19(1); // Params Const.
        j19 onj3 = new j19(2,"MyName"); // Const Overloading
    }
}