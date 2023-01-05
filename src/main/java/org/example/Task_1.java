package org.example;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент
//        которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task_1 {


       public static void add(int[] a, int[] b)
    {
        int[] result = new int[a.length];

        try {
            int i = 0;

            while (a.length == b.length) {
                    result[i] +=  (a[i] - b[i]);
                    i++;
            }

        } catch (Exception e) {
            System.out.println("Длины массивов не равны");
        }

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }


    public static void main(String[] args) {

        int[] array1 = {5, 4, 3, 6};
        int[] array2 = {1, 2, 3};

    }
}