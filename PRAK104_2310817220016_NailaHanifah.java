package com.praktikum1;

import java.util.Scanner;

public class PRAK104_2310817220016_NailaHanifah {
	
		public static String determineWinner(String abuChoice, String bagasChoice) {
	        if (abuChoice.equals(bagasChoice)) {
	            return "Seri";
	        }
	        switch (abuChoice) {
	            case "B":
	                return bagasChoice.equals("G") ? "Abu" : "Bagas";
	            case "G":
	                return bagasChoice.equals("K") ? "Abu" : "Bagas";
	            case "K":
	                return bagasChoice.equals("B") ? "Abu" : "Bagas";
	            default:
	                return "Invalid";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Tangan Abu (misal: G G K): ");
	        String[] abuChoices = scanner.nextLine().split(" ");
	        
	        System.out.println("Tangan Bagas (misal: B K G): ");
	        String[] bagasChoices = scanner.nextLine().split(" ");
	        
	        int abuPoints = 0;
	        int bagasPoints = 0;

	        for (int i = 0; i < 3; i++) {
	            String result = determineWinner(abuChoices[i], bagasChoices[i]);
	            if (result.equals("Abu")) {
	                abuPoints++;
	            } else if (result.equals("Bagas")) {
	                bagasPoints++;
	            }
	        }

	        if (abuPoints > bagasPoints) {
	            System.out.println("Pemenangnya: Abu");
	        } else if (bagasPoints > abuPoints) {
	            System.out.println("Pemenangnya: Bagas");
	        } else {
	            System.out.println("Hasilnya: Seri");
	        }

	        scanner.close();

	}

}