package com.bridgelab;

import java.util.Scanner;

public class pratic01 {

    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no");
        int end = scanner.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= end)
        {
            sum = sum + start;
            start += 1;
        }
        System.out.println(sum);
    }
}
