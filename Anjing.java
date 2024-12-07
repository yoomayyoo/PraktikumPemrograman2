package soal2;

class Anjing extends HewanPeliharaan{
	private String warnaBulu;
	private String[] kemampuan;
	
	public Anjing(String n, String r, String w, String[] k) {
		super(n, r);
		this.warnaBulu = w;
		this.kemampuan = k;
	}
	
	public void displayDetailAnjing() {
		super.display();
		System.out.println("Memiliki warna bulu: " + this.warnaBulu);
		System.out.println("Memiliki kemampuan: ");
		for (String k : kemampuan) {
            System.out.print(k + "  ");
        }
		System.out.println();
	}

}