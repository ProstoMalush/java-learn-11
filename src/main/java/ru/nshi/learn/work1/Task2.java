package ru.nshi.learn.work1;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.SumAllLuckyNumbers(100000, 999999));
    }
    public int SumAllLuckyNumbers(int start, int end) {
        Task1 task1 = new Task1();
        int result = 0;
        for (int number = start; number <= end; number++) {
            if (task1.LuckyNumber(number)) {
                result += number;
            }
        }
        return result;
    }

}
