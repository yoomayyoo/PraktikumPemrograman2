package com.praktikum1;

import java.util.Scanner;

public class PRAK102_2310817220016_NailaHanifah {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka awal: ");
        int startNumber = scanner.nextInt();

        int count = 0; 
        int currentNumber = startNumber;

        while (count < 11) {
            if (currentNumber % 5 == 0) {
                System.out.println((currentNumber / 5) - 1);
            } else {
                System.out.println(currentNumber);
            }
            if (count < 10) {
                System.out.println(",");
            }
            currentNumber++;
            count++;
        }
        
        System.out.println();

        scanner.close();
    }

}