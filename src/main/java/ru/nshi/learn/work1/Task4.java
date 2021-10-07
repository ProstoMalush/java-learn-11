package ru.nshi.learn.work1;
//Написать программу, которая определяет сумму всех простых чисел в диапазоне от 1000 до 2000.
public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.SumAllPrimes(1000, 2000));
    }



    public int SumAllPrimes(int start, int end) {
        Task3 task3 = new Task3();
        int result = 0;
        for (int number = start; number <= end; number++) {
            if (task3.PrimeNumber(number)) {
                result += number;
            }
        }
        return result;
    }
}


