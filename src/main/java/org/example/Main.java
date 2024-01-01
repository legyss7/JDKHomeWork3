package org.example;

public class Main {
    public static void main(String[] args) {
        //Задача 1.
        System.out.println("Задача 1----------");
        System.out.println(Calculator.sum(1, 3.34));
        System.out.println(Calculator.multiply(2.0, 3.34));
        System.out.println(Calculator.divide(4, 2));
        System.out.println(Calculator.subtract(1, 3.3));

        //Задача 2.
        Number[] arr1 = {1.1, 3, 3.0};
        Number[] arr2 = {1.11, 2, 3.9};
        System.out.println("Задача 2------------");
        System.out.println(compareArrays(arr1, arr2));

        //Задача 3.
        Pair<String, Integer> pair1 = new Pair<>("1", 2);
        Pair<String, Integer> pair2 = new Pair<>("ddd", 22);
        System.out.println("Задача 3--------------------");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
    }
    /**
     * Задача 2.
     * Напишите обобщенный метод compareArrays(), который принимает два
     * массива и возвращает true, если они одинаковые, и false в противном случае.
     * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
     * элементы одного типа по парно.
     */
    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length!= arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!(arr1[i].getClass().isInstance(arr2[i]))) {
                return false;
            }
        }
        return true;
    }
}