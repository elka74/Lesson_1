package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a,b;
        String oper;
        a = scr.nextInt();
        b = scr.nextInt();
        oper = scr.next();
        switch (oper){
            case "+":
                System.out.println(a + b);
                break;
            case  "-":
                if (a > b) {
                    System.out.println(a - b);
                }
                else{
                    System.out.println("Невозможно выполнить операцию");
                    }
                }
        }
    }


