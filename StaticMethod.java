package com.practice.javaprograms;

import static com.practice.javaprograms.Gulu.biswal;

class Gulu{
    static void biswal(){
        System.out.println("I'm Gulu");
    }
}

public class StaticMethod{
    public static void main(String[]args){
       new Gulu();
       biswal();
    }
}
