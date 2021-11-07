package ru.nshi.learn.work4;
//Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
// Метод должен вернуть сумму из всех цифр в строке.
//Например, для строки a1b23c4%&50 метод возвратит 15.
public class Task4 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        String str = "a1b23c4%&50";
        String readyStr = task3.creatingStringWithNumbers(str);
        System.out.println("string = "+readyStr);
        char[] array = new char[str.length()];
        int[] arr = task3.creatingArrayWithNumbers(readyStr);
        task3.printArray(arr);
        task4.summArrryNumbers(arr);
    }

    private void summArrryNumbers(int[] arr) {
        int summ=0;
        Task3 task3 = new Task3();
        for (int i=0;i< arr.length; i++)
            summ += arr[i];
        System.out.println("\nsumm = " + summ);
    }


}
