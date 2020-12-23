public class passByValue{

    public static void swap(int a, int d){
        int temp = a;
        a = d;
        d = temp;
    }

    public static void main(String[] args){
        //using primitive data types --------
        int c = 34;
        int d = 19;

        swap(c, d);

        System.out.println(c + " " + d); // => c -> 34 & d -> 19

        //--------------------------------------

        //using NON-primitive data types --------

        Dog c1 = new Dog();
        Dog d1 = new Dog();

        c1.legs = 4;
        d1.legs = 3;

        swap(c, d);

        System.out.println(c1.legs + " " + d1.legs); // => c1 -> 4 & d1 -> 3

        Dog d2 = new Dog();
        d2.legs = 4;

        changeLegs(d2);

        System.out.println(d2.legs); // => d2.legs -> 6
        //--------------------------------------
    }

    public static void swap(Dog a, Dog b){
        Dog temp = a;
        a = b;
        b = temp;
    }

    public static void changeLegs(Dog dog){
        dog.legs = 6;
    }
}

class Dog{
    int legs;
}

/* in case of non-primitive data types no new copy of values is being made rather the object's reference is being passed to the function whereas in case of primitive data types the copy of the values are made and passed to the function and not the reference. And because of this reason, in the second case of non-primitive data types d2.legs value changes*/