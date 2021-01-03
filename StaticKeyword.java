public class StaticKeyword{ // refer point 6.

    static int a = 2; // refers to point 7

    int b = 3;

    class Person{
        int age;
        String name;

        /* static String breed = "Homosapiens"; -> throw an error -> refer to 
                                                   point 7 */
    }

    static class Test{  // refer to point 6

    }

    public static void main(String[] args){ // refer to point 7

        Person p = new Person(); // error: non-static variable this cannot be referenced from a static context

        b = 5; // error: non-static variable a cannot be referenced from a static context (refer to point 8)

        Test t = new Test();

        A objA = new A();
        A.B objB = objA.new B();

        A.C objC = new A.C();
    }
}

class A{

    class B{
       
    }

    static class C{
        
    }
}


/*
    1. 'static' keyword is related to class, not object

    2. The Keyword 'static' indicates that the particular member belongs to a type itself, rather than to an instance of that type.

    3. The keyword can be applied to variables, methods, blocks and nested classes.

    4. 'static' keyword is only used on that field, which will remain same for every instance of class.

    5. 'static' keyword is mainly used for memory management - as we know there can be multiple instance to a class, so the copy of non-static variable will be present in each instance of that class and hence will be taking memory every time. But when we use 'static' keyword then there is only one copy of that variable or method or... present only at the class level, which cannot be altered from outside.

    6. we cannot declare the top-level class with static modifier, but can declare a nested class as static.

    7. we can use 'static' keyword inside main class (top-level class) but cannot use 'static' keyword inside a non-static inner (or nested) class.

    8. we also cannot use non-static (variable | methods | class (cannot make object in case of class)) inside a 'static' method and also cannot make object of non-static class inside a static class;

    9. benefit of created static nested class - we can access that class as if it is outside of that parent class
    for eg -> In above case if i want of make the object of Person class, first i have to make the object of StaticKeyword class then only i can make the object of Person. But if i want to make the object of Test class, i can do it directly.
 */