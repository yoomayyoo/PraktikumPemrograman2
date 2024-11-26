package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

        int jumlahDadu = scanner.nextInt();

        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai(); 
            daftarDadu.add(dadu);
        }

        int totalNilai = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + daftarDadu.get(i).getNilai());
            totalNilai += daftarDadu.get(i).getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}