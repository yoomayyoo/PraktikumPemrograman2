package com.praktikum1;

import java.util.Scanner;

public class PRAK101_2310817220016_NailaHanifah {

	    static class Person {
	        String fullName;
	        String birthPlace;
	        int birthDay;
	        int birthMonth;
	        int birthYear;
	        int height;
	        double weight;

	        public Person(String fullName, String birthPlace, int birthDay, int birthMonth, int birthYear, int height, double weight) {
	            this.fullName = fullName;
	            this.birthPlace = birthPlace;
	            this.birthDay = birthDay;
	            this.birthMonth = birthMonth;
	            this.birthYear = birthYear;
	            this.height = height;
	            this.weight = weight;
	        }

	        String getMonthName(int month) {
	            String[] monthNames = {
	                "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
	                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
	            };
	            return monthNames[month - 1];
	        }

	        public void displayInfo() {
	            System.out.println("Nama Lengkap " + fullName + ", Lahir di " + birthPlace + " pada Tanggal " 
	                               + birthDay + " " + getMonthName(birthMonth) + " " + birthYear);
	            System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Masukkan Nama Lengkap: ");
	        String fullName = scanner.nextLine();

	        System.out.println("Masukkan Tempat Lahir: ");
	        String birthPlace = scanner.nextLine();

	        System.out.println("Masukkan Tanggal Lahir: ");
	        int birthDay = scanner.nextInt();

	        System.out.println("Masukkan Bulan Lahir: ");
	        int birthMonth = scanner.nextInt();

	        System.out.println("Masukkan Tahun Lahir: ");
	        int birthYear = scanner.nextInt();

	        System.out.println("Masukkan Tinggi Badan (cm): ");
	        int height = scanner.nextInt();

	        System.out.println("Masukkan Berat Badan (kg): ");
	        double weight = scanner.nextDouble();

	        Person person = new Person(fullName, birthPlace, birthDay, birthMonth, birthYear, height, weight);

	        person.displayInfo();

	        scanner.close();
	    }
	}