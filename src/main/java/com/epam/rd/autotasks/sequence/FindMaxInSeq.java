package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner input = new Scanner(System.in);
        int max=0, number;
        while (true) {
            number = input.nextInt();
            if (max==0)
                max=number;
            if (number==0)
                break;
            max=Math.max(max,number);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        System.out.println(max());
    }
}
