public class table {
    synchronized void println(int a){
for(int i=0;i<4; i++){
    System.out.println(a*i);
    System.out.println();
    try {
        Thread.sleep(400);
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    }
}
