package org.example;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному
//        элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше

public class Task_2 {


    public static void add(int[] a, int[] b)
    {
        int[] result2 = new int[a.length];

        try {
            int i = 0;

            while (a.length == b.length) {
                result2[i] +=  (a[i] / b[i]);
                i++;
            }

        } catch (ArrayIndexOutOfBoundsException exception1) {
            System.out.println("Вы обратились к несущ. инжексу");
        } catch (RuntimeException exception2){
            System.out.println("Длины массивов не равны");
        }

        for (int j = 0; j < result2.length; j++) {
            System.out.println(result2[j]);
        }

    }

}
