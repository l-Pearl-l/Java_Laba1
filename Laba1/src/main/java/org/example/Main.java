package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Puchkov Alexey 3 course group PI
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double valueAcos = Math.acos(Math.pow(Math.pow(x, 0.2) / (Math.pow(x, 0.2) + 1), 9));
        double tg3x = (3 * Math.tan(x) - Math.pow(Math.tan(x), 3)) / (1 - 3 * Math.pow(Math.tan(x), 2));
        double firstTermLog = Math.pow(4, tg3x);
        double secondTermLog = Math.sqrt(Math.abs(3 * x - 1));
        double thirdTermLog = Math.pow(Math.abs(x), 2 * Math.sin(x) - Math.cos(x));
        double valueLog = Math.pow(Math.log((firstTermLog + secondTermLog + thirdTermLog ))/ Math.log(5), 2);
        double y = valueAcos + valueLog;


        double dot = Math.pow(x, 2) + Math.pow(y, 2);
        double semicircle = 25 / 2;

        if (dot <= semicircle){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}