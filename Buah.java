package praktikum2.soal1;

public class Buah {
	private String nama;
    private double beratPerUnit;
    private double hargaPerUnit;
    private double jumlahBeli;

    public Buah(String nama, double beratPerUnit, double hargaPerUnit, double jumlahBeli) {
        this.nama = nama;
        this.beratPerUnit = beratPerUnit;
        this.hargaPerUnit = hargaPerUnit;
        this.jumlahBeli = jumlahBeli;
    }

    public void info() {
        double hargaSebelumDiskon = hitungHargaSebelumDiskon();
        double totalDiskon = hitungDiskon();
        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + beratPerUnit + "kg");
        System.out.println("Harga: " + hargaPerUnit);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargaSebelumDiskon));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", totalDiskon));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargaSetelahDiskon));
        System.out.println();
    }

    public double hitungHargaSebelumDiskon() {
        return (jumlahBeli / beratPerUnit) * hargaPerUnit;
    }

    public double hitungDiskon() {
        double diskonPer4Kg = 0.02;
        double jumlahDiskon = (int) (jumlahBeli / 4) * diskonPer4Kg * hitungHargaSebelumDiskon();
        return jumlahDiskon;
    }
}