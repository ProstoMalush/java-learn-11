package ru.nshi.learn.work4;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        String str = "abcdefg";
        String[] arrayString = task1.arrayString(str);
        task1.printArray(arrayString);


    }

    public String[] arrayString(String str) {
        String[] array = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.substring(0, i + 1);
        }
        return array;
    }

    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
    }
}
