import java.util.*;

class Employee{
    public String employeename;//attribute
    private int salary;//attribute encapsulated
    
    public void setsalary(int val){
        salary=val;
    }
    public void setname(String s){
        employeename=s;
    }
    public int getsalary(){
        return salary;
    } 
    
}
//methods

public class Main{
    public static void main(String[] args){
     Employee obj1=new Employee();
     obj1.setname("ABC");
     obj1.setsalary(1000);
     System.out.println("Salary of "+obj1.employeename +"is " + obj1.getsalary());
     Employee obj2=new Employee();
     obj2.setname("CDE");
     obj2.setsalary(2000);
     System.out.println("Salary of "+obj2.employeename + "is " + obj2.getsalary());
    }
}

// Employee obj1 = new Employee();
//
// obj1 is a reference variable stored in STACK memory
// The actual Employee object is created in HEAP memory
//
// Stack memory is cleared automatically when the method execution ends
// Heap memory is managed by the Garbage Collector
