package org.example;

public class Main {

    public static void main(String[] args) {
        try {
            String string = InputString.getSting();
            System.out.println(string);
        }catch (moreTenCharsExeption e){
            System.out.println("More than 10 chars input");
        }finally {
            System.out.println("Продолжение программы");
        }
    }
}

