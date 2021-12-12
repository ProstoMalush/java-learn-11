package ru.nshi.learn.work3;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        int[][] array = task1.createMatrix();
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);
        System.out.println();
        int[] newArray = task1.sumLinesArray(array);
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]);
            if (i+1 < array.length){
                System.out.print(", ");
            }
        }
    }

    public int[][] createMatrix(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int i = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int j = in.nextInt();

        int[][] array = new int[i][j];
        return array;
    }

    public int[][] randomFillingMatrix(int[][] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(100);
            }
        }
        return array;
    }

    public static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                System.out.printf("%4d" , ints[j]);
            }
            System.out.println("");
        }
    }

    public int[] sumLinesArray(int[][] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int sum = 0;
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
            newArray[i] = sum;
        }
        return newArray;
    }
}
