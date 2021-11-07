package ru.nshi.learn.work4;
//Напишите метод, который принимает строку,
// состоящую из слов, разделенных пробелами.
// Метод должен вернуть слово с максимальным количеством уникальных символов.
public class Task7 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();

        String str = task5.inputString();
        String result = task6.maxUniqueSymbolsInString(str.trim().split("\\s+"));
        System.out.println("макс кол-во уникальных сиволов в этом слове : " + result);
    }
}
