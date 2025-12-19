// Design a class Rectangle with the following specifications :

// Attributes :

// length (double) : Represents the length of the rectangle
// width (double) : Represents the width of the rectangle.
// Area (double) : Represents the area of rectangle.
// Constructors :

// A default constructor that initializes both length and width to 1.0
// A parameterized constructor that takes two arguments to initialize length and width.
// Methods :

// void calculateArea() : Computes the area of rectangle.
// void displayDetails() : Prints the rectangle's details, including its dimensions and area, in format specified below :




import java.util.*;


class Rectangle{
    private double length;
    private double width;
    private double area;
    Rectangle(){
        length=1.0;
        width=1.0;
    }//default constructor
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }//parameterized constructor
    void calculateArea(){
        area=(this.length)*(this.width);
    }
    void displayDetails(){
        System.out.printf("Length : %.2f\n",this.length);
        System.out.printf("Width : %.2f\n",this.width);
        System.out.printf("Area : %.2f\n",this.area);
    }
}


public class Practice{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        r1.displayDetails();
        Rectangle r2 = new Rectangle(length, width);
        r2.calculateArea();
        r2.displayDetails();

        scanner.close();
    }
}