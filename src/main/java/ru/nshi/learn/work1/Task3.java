package ru.nshi.learn.work1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.print("введите число: ");
        Scanner in = new Scanner(System.in);
        int inputValue = in.nextInt();
        System.out.println(task3.PrimeNumber(inputValue));

    }
    public boolean PrimeNumber(int number){
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        if (result == 2) {
            return true;
        } else return false;
    }
}
