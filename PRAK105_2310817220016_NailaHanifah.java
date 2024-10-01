package com.praktikum1;

import java.util.Scanner;

public class PRAK105_2310817220016_NailaHanifah {

	private static final double PHI = 3.14;
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Masukkan jari-jari: ");
	        double jariJari = scanner.nextDouble();
	        
	        System.out.println("Masukkan tinggi: ");
	        double tinggi = scanner.nextDouble();
	        
	        double volume = PHI * jariJari * jariJari * tinggi;

	        System.out.printf("Volume tabung dengan jari-jari %.2f cm dan tinggi %.2f cm adalah %.3f m3\n", jariJari, tinggi, volume);
	        
	        scanner.close();

	}

}