package ru.nshi.learn.work4;
import java.util.Scanner;
//Напишите метод, который принимает массив строк,
// состоящих из букв, цифр и иных символов.
// Метод должен вернуть строку с максимальным количеством уникальных символов.
public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        String[] strArray = task6.returnStringArray();
        String result = task6.maxUniqueSymbolsInString(strArray);
        System.out.println("максимальное кол-во уникальных сиволов в данной строке : " + result);
    }

    public String[] returnStringArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arrayLength = in.nextInt();
        String[] strArray = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Заполните элемент массива №%d : ", i + 1);
            strArray[i] = in.next();
        }
        return strArray;
    }

    public String maxUniqueSymbolsInString(String[] str) {
        Task5 task5 = new Task5();
        String readyStr = "";
        String[] arrayUnique = new String[str.length];
        for (int i = 0; i < arrayUnique.length; i++) {
            arrayUnique[i] = task5.searchForUniqueSymbols(str[i]);
        }

        for (int i = 1; i < arrayUnique.length; i++) {
            if (arrayUnique[i].length() > arrayUnique[i - 1].length()) {
                readyStr = str[i];
            } else {
                readyStr = str[i - 1];
            }
        }
        return readyStr;
    }
}
