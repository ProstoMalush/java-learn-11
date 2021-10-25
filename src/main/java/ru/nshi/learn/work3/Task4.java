package ru.nshi.learn.work3;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix();


        task1.randomFillingMatrix(array);
        task1.printMatrix(array);
        task4.sortArray(array);

        System.out.println();
        task1.printMatrix(array);
    }

    int[][] sortArray (int[][] array) {
        int iEnd = array.length * array[0].length;
        for (int i = 0; i < iEnd - 1; i++) {
            int iLength = i / array.length, iWidth = i % array[0].length;
            int minElements = array[iLength][iWidth];
            for (int j = i + 1; j < iEnd; j++) {
                if (array[iLength][iWidth] > array[j / array.length][j % array[0].length]) {
                    int temp = array[j / array.length][j % array[0].length];
                    array[j / array.length][j % array[0].length] = array[iLength][iWidth];
                    array[iLength][iWidth] = temp;
                }
            }
        }
        return array;
    }
}


