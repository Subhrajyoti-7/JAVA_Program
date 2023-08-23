package com.practice.javaprograms;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Base class");
    }

    /*
    // We can write the main() also as,
       static final synchronized strictfp public void main(String... gulu)
     */

    /*
    // main() method can be overloaded
    // But only String[] main() will be called
    public static void main(int[] args) {
        System.out.println("Integer");
    }
    */

}

/*
// Inheritance can be applicable for main()
// While executing child class , if child class doesn't contain main(), then parent class     main() will be executed
class MainMethodChild extends MainMethod{
    public static void main(String[] args) {
        System.out.println("Child class");
    }
}
*/
