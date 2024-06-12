package org.example.hw_06juni;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class hw06juni {
    public static void main(String[] args) {
        System.out.println("-------------------task 1--------------------------------");
        // 1 уровень сложности: №1.
        //Создайте массив из 8 случайных целых чисел из интервала [1;50]
        //Выведите массив на консоль в строку.
        //Замените каждый элемент с нечетным индексом на ноль.
        //Снова выведете массив на консоль в отдельной строке.
        int minNum =1;
        int maxNum = 50;
        int[] randomArray=new int[8];
        Random random=new Random();
        for (int i=0; i<8; i++){
            randomArray[i]= random.nextInt(minNum, maxNum);
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i=0; i<8; i+=2){
            randomArray[i]= 0;
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println();
        System.out.println("-------------------task 2--------------------------------");
        //№2.
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        int[] randomArray2=new int[5];
        for (int i=0; i<5; i++){
            randomArray2[i]= random.nextInt(10,99);
        }
        System.out.println(Arrays.toString(randomArray2));
        int counter=0;
        for (int i=1; i<5; i++){
            if (randomArray2[i]>randomArray2[i-1]){
                counter++;
            }
        }
        String conclusion= counter == randomArray2.length-1 ? "The array is strictly increasing" : "The array is NOT strictly increasing";
        System.out.println(conclusion);
    }
}

