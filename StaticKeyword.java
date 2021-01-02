public class StaticKeyword{ // refer point 6.

    static int a = 2; // refers to point 7

    class Person{
        int age;
        String name;

        /* static String breed = "Homosapiens"; -> throw an error refer to 
                                                   point 7 */
    }

    static class C{  // refer to point 6

    }

    public static void main(String[] args){} // refer to point 7
}


/*
    1. 'static' keyword is related to class, not object

    2. The Keyword 'static' indicates that the particular member belongs to a type itself, rather than to an instance of that type.

    3. The keyword can be applied to variables, methods, blocks and nested classes.

    4. 'static' keyword is only used on that field, which will remain same for every instance of class.

    5. 'static' keyword is mainly used for memory management - as we know there can be multiple instance to a class, so the copy of non-static variable will be present in each instance of that class and hence will be taking memory every time. But when we use 'static' keyword then there is only one copy of that variable or method or... present only at the class level, which cannot be altered from outside.

    6. we cannot declare the top-level class with static modifier, but can declare a nested class as static.

    7. we can use 'static' keyword inside main class (top-level class) but cannot use 'static' keyword inside a non-static inner (or nested) class.

    8. we also cannot used non-static (variable | methods | class (make objects in case of class)) inside a 'static' method.
 */