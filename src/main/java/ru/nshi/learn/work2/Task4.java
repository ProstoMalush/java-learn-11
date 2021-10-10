//Поменять местами минимальный и максимальный элементы одномерного массива.
package ru.nshi.learn.work2;



public class Task4 {

    public static void main(String[] args){
        Task4 task4 = new Task4();
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[] array = task1.createArray(10);
        task1.fillArrayByRandom(array);
        System.out.println("начальный массив");
        task1.printArray(array);
        System.out.println("\nконечный массив");
        task4.printArray4(array);

        System.out.println();

        System.out.println("\nМаксимальное значение массива = " + task3.maxValue(array));
        System.out.println("Минимальное значение массива = " + task3.minValue(array));
        System.out.println("индекс максимального значения массива = " + task4.IndexMax(array));
        System.out.println("индекс минимального значения массива = " + task4.IndexMin(array));

    }

    public int IndexMax(int[] array) {
        int max = array[0];
        int Imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
                Imax = i;
            }
        }
        return Imax;
    }

    public int IndexMin(int[] array) {
        int min = array[0];
        int Imin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                Imin = i;

            }
        }
        return Imin;
    }

    private void printArray4(int[] array) {

        Task4 task4 = new Task4();
        Task3 task3 = new Task3();
        int Imin = task4.IndexMin(array);
        int Imax = task4.IndexMax(array);
        int min = task3.minValue(array);
        int max = task3.maxValue(array);

        for (int i = 0; i < array.length; i++) {
            if (i == Imax){
                System.out.print(min + ", ");
            } else if (i == Imin){
                System.out.print(max + ", ");
            } else {
                System.out.print(array[i]);
                if (i + 1 < array.length) {
                    System.out.print(", ");
                }
            }
        }
    }

}





