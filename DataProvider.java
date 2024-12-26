package praktikum6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataProvider {
    public static ObservableList<Mahasiswa1> getMahasiswaList() {
        return FXCollections.observableArrayList(
            new Mahasiswa1(1, "122770", "Esyoel"),
            new Mahasiswa1(2, "122771", "Xiumin"),
            new Mahasiswa1(3, "122772", "Suho"),
            new Mahasiswa1(4, "122773", "Lay"),
            new Mahasiswa1(5, "122774", "Baekhyun"),
            new Mahasiswa1(6, "122775", "Chen"),
            new Mahasiswa1(7, "122776", "Chanyeol"),
            new Mahasiswa1(8, "122777", "Kyungsoo"),
            new Mahasiswa1(9, "122778", "Kai"),
            new Mahasiswa1(10, "122779", "Sehun")
        );
    }


}
