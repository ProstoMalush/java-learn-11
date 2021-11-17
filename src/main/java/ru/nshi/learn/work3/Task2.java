package ru.nshi.learn.work3;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Task2 task2 = new Task2();
        Task1 task1 = new Task1();
        int[][] array = task1.createMatrix();
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);
        System.out.println();
        int[] newArray = task2.sumColumnsArray(array);
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]);
            if (i+1 < array.length){
                System.out.print(", ");
            }
        }
    }
    public int[] sumColumnsArray(int[][] array){
        int[] newArray = new int[array.length];
        for (int j = 0; j < array.length; j++){
            int sum = 0;
            for (int i = 0; i < array[j].length; i++){
                sum += array[i][j];
            }
            newArray[j] = sum;
        }
        return newArray;
    }
}
