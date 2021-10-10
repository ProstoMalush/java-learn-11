package ru.nshi.learn.work2;

public class Task5 {
    public static void main(String[] args){
        Task5 task5 = new Task5();
        Task4 task4 = new Task4();
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[] array = task1.createArray(10);
        task1.fillArrayByRandom(array);
        task1.printArray(array);
        task4.IndexMin(array);
        task4.IndexMax(array);

        System.out.println();
        System.out.println("\nнайдем среднее значение между числами ( " + task3.maxValue(array) + " и " + task3.minValue(array) + ")");
        System.out.println();

        float Average = task5.Average(array);
        if (Average != 0)
            System.out.println("среднее значение = " + Average);
    }

    public float Average(int[] array) {
        Task4 task4 = new Task4();
        int Imin = task4.IndexMin(array);
        int Imax = task4.IndexMax(array);
        int Sum = 0;
        int k = 0;
        float Sr = 0;
        if (Imin < Imax){
            for (int i = Imin+1; i < Imax; i++) {
                Sum += array[i];
                k += 1;
            }
        } else if (Imax < Imin){
            for (int i = Imax +1 ; i < Imin ; i++) {
                Sum += array[i];
                k += 1;
            }
        }
        if (k != 0) {
            Sr = Sum / k;
        } else System.out.println("\nнет элеметов между ними");
        return Sr;
    }
}
