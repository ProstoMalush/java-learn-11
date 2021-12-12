package ru.nshi.learn.work4;

import java.util.Random;

//Напишите метод, который принимает строку,
// состоящую из букв, цифр и иных символов.
// Метод должен вернуть массив из всех цифр в строке.
public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        String str = "a1b23c4%&50";
        String readyStr = task3.creatingStringWithNumbers(str);
        System.out.println("string = "+readyStr);
        int[] arr = task3.creatingArrayWithNumbers(readyStr);
        task3.printArray(arr);
    }




    public String creatingStringWithNumbers(String str) {
        char[] array = str.toCharArray();

        String string = new String();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(array[i])) {
                string += array[i] ;

            }
        }
        return string;
    }

    public int[] creatingArrayWithNumbers(String readyStr){
        char[] arrayWithNumbers = {'0', '1', '2','3','4','5','6','7','8', '9'};
        char[] array = readyStr.toCharArray();
        int [] arr = new int[readyStr.length()];
        for (int i = 0 ; i < readyStr.length();i++) {
            for (int j = 0; j < arrayWithNumbers.length; j++) {
                if (array[i] == arrayWithNumbers[j]){
                    arr[i] = j;
                }
            }
        }
        return arr;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
    }

}

