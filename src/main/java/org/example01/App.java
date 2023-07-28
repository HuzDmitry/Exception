package org.example01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(setDoubleInConsole());

    }

    // задание №1
    public static float setDoubleInConsole(){
        float in =0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("введите чило типа float");
            scanner.hasNext();
            try{
                String ins = scanner.next();
                in = Float.parseFloat(ins);
                return in;
            }catch (Exception e){
                System.out.println("ввели некорректное число");
            }
        }
    }

    //Задание 2
    private static void example2(int[] intArray){

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
