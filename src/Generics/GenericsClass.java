package Generics;
/*
*The term generics means parameterized types
*They enable you to create classes, interfaces, and methods in which the type of data
 upon which they operate is specified as a parameter
*
*A class,interface, or method that operates on a parameterized type is called generic
*  */

public class GenericsClass<T> {
    T ob; //declare an object of type T

    //pass the constructor a reference to the object of type T
    public GenericsClass(T o) {
        ob = o;
    }

    // Return the object
    T getob() {
        return ob;
    }
// Show the objects type
    void showType() {
        System.out.println("The type of T is" + ob.getClass().getName());
    }
}
