package praktikum2.soal3;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai(); 
	 	// pada baris ini terjadi error karena kurangnya titik koma (;) dan penggunaan (=) yang tidak tepat 
        // p1.nama = "Roi" 
	 	p1.setNama("Roi");
	 	// pada baris ini terjadi error karena penggunaan (=) yang tidak tepat
	 	//  p1.asal = "Kingdom of Orvel";
        p1.setAsal("Kingdom of Orvel"); 
        p1.setJabatan("Assasin"); 
        p1.setUmur(17); // menambahkan setter umur
 
        System.out.println("Nama Pegawai: " + p1.getNama()); 
        System.out.println("Asal: " + p1.getAsal()); 
        // pada baris ini terjadi error karena tidak menggunakan getter sedangkan atribut jabatan bersifat private
        // System.out.println("Jabatan: " + p1.jabatan); 
        System.out.println("Jabatan: " + p1.getJabatan()); 
        // pada baris ini terjadi error karena tidak menggunakan getter sedangkan atribut umur bersifat private
        // System.out.println("Umur: " + p1.umur); 
        System.out.println("Umur: " + p1.getUmur() + " tahun"); 
	} 

}