package com.bridgelab;
import java.util.Scanner;
public class PrintNameByCamndLine
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter first Name");
        name = scanner.nextLine();
        System.out.println("The User first Name is:"  +name);

    }
}
