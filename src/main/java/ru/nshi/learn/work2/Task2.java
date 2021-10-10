package ru.nshi.learn.work2;
//Найти сумму положительных элементов одномерного массива. Диапазон случайных значений [-50, 51).
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Task1 task1 = new Task1();

        int[] array = task1.createArray(10);
        array = task2.fillArrayByRandom(array);
        task1.printArray(array);
        System.out.println("\nсумма положительных = " + task2.SumArray(array));
    }

    public int[] fillArrayByRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101)-50;
        }
        return array;
    }

    public int SumArray(int[] array) {
        int Sum=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                Sum += array[i];
            }
        }
        return Sum;
    }
}
