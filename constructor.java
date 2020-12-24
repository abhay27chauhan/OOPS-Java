public class constructor{

    public static void main(String[] args){
         
        Vehicle1 car1 = new Vehicle1(); // calling default

        Vehicle2 car2 = new Vehicle2(4); // calling 2nd one
        Vehicle2 car3 = new Vehicle2(2, "yellow"); // calling 3rd one

        System.out.println(car1.wheels);

        System.out.println(car2.wheels + " " + car2.headlights);
        System.out.println(car3.wheels + " " + car3.headlights + " " + car3.color);
    }
}

class Vehicle1{
    int wheels;

    // default constructor -> no need to mention it, java by default has it but if you make your own constructors (as i have done in Vehicle2 class) then you won't be able to access it, until you explicitly define it by yourself inside class as i have done. 
    Vehicle1(){}
}

class Vehicle2{
    int wheels;
    int headlights;
    String color;

    // no argument constructor
    Vehicle2(){ 
        wheels = 4; // initialise here
    }

    // Parameterized constructor
    Vehicle2(int wheels){ 
        this.wheels = wheels;
        headlights = 2; // constant, so no need to parameterize it
    }

    Vehicle2(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        headlights = 2;
    }
}



/*
    A constructor is similar to a method (but without return type);
    Name of constructor is always equal to the name of class;
    the constructor is invoked automatically when the object is instantiated;

    default constructor -> class_Name(){}

    Types of constructor - 1. no argument constructor | 2. Parameterized Constructor 

    constructor Overloading -> means two or more constructors that differs due to parameters.
    eg -> as done in class 'Vehicle2'
 */