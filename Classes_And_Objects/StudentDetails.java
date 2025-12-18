import java.util.*;
class Student{
    private String name;
    private int rollNumber;
    void setdetails(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public void printDetails(){
        System.out.println("NAME : "+this.name);
        System.out.println("ROLL NUMBER : "+this.rollNumber);
    }
}





public class StudentDetails{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name :");
        String name=scanner.nextLine();
        System.out.println("Enter Roll Number :");
        int rollNumber=scanner.nextInt();
        Student student=new Student();
        student.setdetails(name,rollNumber);
        student.printDetails();
        scanner.close();
    }
}