package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	double[] array = {5.2, -1.2, 3.4, -4.2, 7.5};
	double sum = 0;
	int k = 0;
	boolean poz =false;

	for (double arr: array) {
	    if (arr < 0){
	       poz = true;
        }

	    if (poz ==true){
	        if (arr > 0){
	            sum = sum = arr;
	            k = k=1;

            }

        }


    }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма: " + sum + "Количество: " + k + "\n Среднее арифметическое " + sum/k);



    }
}
