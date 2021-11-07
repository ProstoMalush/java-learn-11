package ru.nshi.learn.work4;

import java.util.Scanner;

//Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
// Метод должен вернуть строку состоящую из уникальных символов.
public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        String str = task5.inputString();

        String readyStr = task5.searchForUniqueSymbols(str);
        System.out.println(readyStr);
    }

    public String inputString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        return str;
    }
    public String searchForUniqueSymbols(String str){
        StringBuilder builder = new StringBuilder("");
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++){
            if (builder.toString().contains(String.valueOf(strArray[i])) == false){
                builder.append(strArray[i]);
            }
        }
        String readyStr = builder.toString();
        return readyStr;
    }
}


