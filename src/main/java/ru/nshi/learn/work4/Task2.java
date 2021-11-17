package ru.nshi.learn.work4;
//Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов. Метод возвращает строку, составленную только из заглавных букв.
//Например, для строки ФSва12ЕE_3Q метод возвратит ФSЕEQ.
public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String str = "ФSва12ЕE_3Q";
        String readyStr = task2.derivationOfUppercaseCharacters(str);
        System.out.println("string = "+readyStr);
    }
    public String derivationOfUppercaseCharacters(String str) {
        char[] array = str.toCharArray();
        String string = new String();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(array[i])) {
                string += array[i];
            }
        }
        return string;
    }

}
