import java.awt.*;
class awtReg {
    awtReg() {   
    Frame f = new Frame();  
    Label l1 = new Label("UserName: "); +6
    
    Label l2 = new Label("Mobile: "); 
    Label l3 = new Label("Email: "); 
    Label l4 = new Label("Password: ");   
    TextField t1 = new TextField();
    TextField t2 = new TextField();  
    TextField t3 = new TextField();  
    TextField t4 = new TextField();  
    Button b1 = new Button("Register");   

    // setting position of above components in the frame  
    l1.setBounds(20, 40, 80, 30);
    l2.setBounds(20, 80, 80, 30);  
    l3.setBounds(20, 120, 80, 30);
    l4.setBounds(20, 160, 80, 30);  
    t1.setBounds(100, 40, 80, 30);  
    t2.setBounds(100, 80, 80, 30);  
    t3.setBounds(100, 120, 80, 30);  
    t4.setBounds(100, 160, 80, 30);
    b1.setBounds(50, 200, 80, 30);

    // adding components into frame    
    f.add(l1); f.add(l2); f.add(l3); f.add(l4);
    f.add(t1); f.add(t2); f.add(t3); f.add(t4);
    f.add(b1);   
    f.setSize(200,250);    
    f.setTitle("Registration Form"); 

    // no layout  
    f.setLayout(null);   
    f.setVisible(true);  
}    

// main method  
    public static void main(String args[]) {    
        awtReg awt_obj = new awtReg();    
    }  
  
}