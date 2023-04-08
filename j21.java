// 21. Write a java program to find the result sheet of a student using Interfaces. 
// The details are as follow:-
//  Marks Grade:-// >90 Excellent // >60 and <=90 Good // Below 60 Average
// The format of output is as follow:-
//  Marks of subject 1 // Marks of Subject 2 // Marks of subject 3
//  Marks obtained // Total Marks // %Age

interface result{
    void percentage();  
    void getMarks();
    void grade();
}
class student implements result{
int math_marks, ds_marks, wad_marks, java_marks;
float percentage;
public void setMarks(int math_marks, int ds_marks, int wad_marks, int java_marks){
    this.math_marks=math_marks;
    this.ds_marks=ds_marks;
    this.wad_marks=wad_marks;
    this.java_marks=java_marks;
}
public void getMarks(){
    System.out.println("Math Marks : "+math_marks);
    System.out.println("DS Marks : "+ds_marks);
    System.out.println("WAD Marks : "+wad_marks);
    System.out.println("Java Marks : "+java_marks);
    System.out.println();
}
public void percentage(){
    int marks_obtained = math_marks+ds_marks+wad_marks+java_marks;
    float total_marks = 4*30f;
    percentage = marks_obtained/total_marks*100f; 
    System.out.println("Marks Obtained : "+marks_obtained);
    System.out.println("Total Marks : "+total_marks);
    System.out.println("Percentage : "+percentage);
}
public void grade(){
    if(percentage>90){
        System.out.println("Excellent");
    }
    else if(percentage>60 && percentage<=90){
        System.out.println("Good");
    }
    else{
        System.out.println("Average");
    }
}
}
public class j21 { 
    public static void main(String args[]){
        student s1 = new student();
        s1.setMarks(26,26,29,28);
        s1.getMarks();
        s1.percentage();
        s1.grade();
    }
}