package ru.nshi.learn.work3;

// Осуществить проверку двумерного массива на "магический квадрат".

public class Task3 {
    public static void main(String[] args){
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix();
        task1.randomFillingMatrix(array);
        task1.printMatrix(array);
        task1.sumLinesArray(array);
        System.out.println();
        System.out.println("Сумма элементов главной диагонали = " + task3.sumMainDiagonal(array));
        System.out.println("Сумма элементов побочной диагонали = " + task3.sumCollateralDiagonal(array));
        if(task3.magicMatrix(array)) System.out.println("квадрат магический");
            else System.out.println("квадрат не магический");

    }

    public int sumMainDiagonal (int[][] array){
        int sumMain = 0; int element = -1;
        for (int i = 0; i < array.length; i++){
            element++;
            for (int j = element; j < array[i].length;){
                sumMain += array[i][j];
                break;
            }
        }
        return sumMain;
    }

    public int sumCollateralDiagonal(int[][] array){
        int sumCollateral = 0; int element = array.length; ;
        for (int i = 0; i < array.length; i++){
            element--;
            for (int j = element; j >= 0; j--){
                sumCollateral += array[i][j];
                break;
            }
        }
        return sumCollateral;
    }

    public boolean magicMatrix(int[][] array){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        int sumMain = task3.sumMainDiagonal(array);
        int sumCollateral = task3.sumCollateralDiagonal(array);
        int[] sumLines = task1.sumLinesArray(array);
        int[] sumColumns = task2.sumColumnsArray(array);
        task2.sumColumnsArray(array);

        if (sumMain == sumCollateral) {
            for (int i = 1; i < array.length; i++)
                {
                    if (sumLines[i] != sumLines[i-1]) return false;
                    if (sumColumns[i] != sumColumns[i-1]) return false;
                }
        }else return false;
        return true;
    }
}
