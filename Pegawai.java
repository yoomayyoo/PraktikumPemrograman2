package praktikum2.soal3;

public class Pegawai {
		// access modifier kurang sesuai 
		// public String nama; 
		// public char asal; // penggunaan char sebaiknya diganti menjadi String
		// public String jabatan; 
		// public int umur; 
		private String nama;
		private String asal;
		private String jabatan;
		private int umur;
		 
		    public String getNama() { 
		        return nama; 
		    } 
		    
		    // menambahkan method untuk memasukkan nama
		    public void setNama(String nama) { 
		        this.nama = nama; 
		    } 
		 
		    public String getAsal() {
		    	return asal;
		    } 
		    
		    // menambahkan method untuk mengatur asal
		    public void setAsal(String asal) { 
		        this.asal = asal; 
		    } 
		 
		    // terjadi error karena parameter nya hilang
		    // public void setJabatan() { 
		    public void setJabatan(String j) {
		        this.jabatan = j; 
		    } 
		    
		    // menambahkan method untuk mengatur jabatan
		    public String getJabatan() {
		        return jabatan;
		    }
		    
		    // menambahkan method untuk mendapatkan dan mengatur umur
		    public int getUmur() {
		        return umur;
		    }
		    public void setUmur(int umur) {
		        this.umur = umur;
		    }
	}