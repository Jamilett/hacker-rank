package com.hackerrank;

import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int N = 18;
//        if (N >= 1 && N <= 100) {
//
//            if (N % 2 != 0) {
//                System.out.println("Weird");
//            } else if (N >= 2 && N <= 5) {
//                System.out.println("Not Weird");
//            } else if (N >= 6 && N <= 20) {
//                System.out.println("Not Weird2");
//            } else if (N > 20) {
//                System.out.println("Not Weird3");
//            }
//        } else {
//            System.out.println("ERROR");
//        }
// EJERCICIO 2: 
//        Scanner scan = new Scanner(System.in);
//        
//        int i = Integer.parseInt(scan.nextLine());
//        double d = Double.parseDouble(scan.nextLine());
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
        
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N >= 2 && N <= 20){
        for (int i = 1; i <= 10; i++) {
            int result = N*i;
            System.out.println(N + " x " + i + " = " + result);
           }             
        }
    }
}
