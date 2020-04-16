package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 5000001) {
            System.out.printf("%f",(float)(x * 35) / 100);
        }
        else if (x >= 2000001) {
            System.out.printf("%f",(float)(x * 30) / 100);
        }
        else if (x >= 1000001) {
            System.out.printf("%f",(float)(x * 25) / 100);
        }
        else if (x >= 750001) {
            System.out.printf("%f",(float)(x * 20) / 100);
        }
        else if (x >= 500001) {
            System.out.printf("%f",(float)(x * 15) / 100);
        }
        else if (x >= 300001) {
            System.out.printf("%f",(float)(x * 10) / 100);
        }
        else if (x >= 150000) {
            System.out.printf("%f",(float)(x * 5) / 100);
        }
        else System.out.println("maitongsaipase");
    }
}
