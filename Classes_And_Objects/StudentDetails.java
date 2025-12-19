// You are tasked with designing a class Student that stores and displays information about students.

// The class must have the following :



// Attributes :

// name (string) : Stores the name of the student.
// rollNumber (int) : Stores the roll number of the student
// Methods :

// setDetails (String name, int rollNumber) : This method initializes the attributes name and rollNumber with the values provided by the user.
// displayDetails() : This method prints the details of the student in following format (The output consist of two separate lines) :





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
