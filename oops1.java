// every file can contain only single 'public' main class

public class oops1{

    public static void main(String[] args){

        // Object 1
        Person p1 = new Person();
        p1.name = "Abhay"; // property
        p1.age = 21;        // property

        // Object 2
        Person p2 = new Person();
        p2.name = "Anuj";
        p2.age = 24;

        // accessing properties
        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        // accessing behaviours
        p1.eat();
        p2.walk();
        p2.walk(2);
    }
}

// class -> blue print -> no physical existance -> no space in memory at runtime
// every class has 2 things -> 1. Properties | 2. Behaviour (Methods)
// the class is used to create multiple 'objects' -> take space in memory and have address

// Person class
class Person{
    // properties
    String name;
    int age;

    // Behaviours (Methods)
    void walk() {
        System.out.println(name + " is walking.");  
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walk(int steps){
        System.out.println(name  + " walked " + steps + " steps");
    }
}


/*
    Method Overloading -> when a class has two or more methods by the same name but different parameters, it is known as method overloading.

    void walk(){}
    void walk(int a){}
    void walk(float a){}
    void walk(int a, int b){}

*/

/* Polymorphism -> poly means 'many' + morphism means 'forms' 
    2 Types -> 1. Compiled Time Polymorphism
               2. Runtime Polymorphism

    void walk(){} and void walk(int steps){} are examples of compiled time polymorphism because we can tell which function will run when called, at compiled time only

*/