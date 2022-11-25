package org.example;

import java.util.Scanner;

public class InputString {
    public static String getSting() throws moreTenCharsExeption{
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if(string.length()>10) throw new moreTenCharsExeption();
        return string;
    }

}

