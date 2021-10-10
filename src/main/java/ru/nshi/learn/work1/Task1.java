package ru.nshi.learn.work1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Scanner in = new Scanner(System.in);
        System.out.print("введите шестизначное число: ");
        int inputValue = in.nextInt();
        System.out.println(task1.LuckyNumber(inputValue));
    }

    public boolean LuckyNumber(int number) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < 3; i++) {
            right += number % 10;
            number /= 10;
        }
        for (int i = 0; i < 3; i++) {
            left += number % 10;
            number /= 10;
        }
        if (left == right) {
            return true;
        } else return false;
    }
}






