package org.example01;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        while (true){
            try {
                notNullChar();
                break;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static void notNullChar() throws Exception {
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.isEmpty()){
            throw new Exception("пустые строки вводить нельзя");
        }else{
            System.out.println("вы ввели строку: "+string);
        }
    }
}
