package com.praktikum1;

import java.util.Scanner;

public class PRAK103_2310817220016_NailaHanifah {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah bilangan (N) dan bilangan awal: ");
        int N = scanner.nextInt();  
        int startNumber = scanner.nextInt();

        int count = 0; 
        int currentNumber = startNumber;

        do {
            if (currentNumber % 2 != 0) {
                System.out.print(currentNumber);
                count++;
                if (count < N) {
                    System.out.print(", ");
                }
            }
            currentNumber++;
        } while (count < N);


        System.out.println();

        scanner.close();

	}

}