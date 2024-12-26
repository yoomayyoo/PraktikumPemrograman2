package praktikum6;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainAppController {
	
    @FXML
    private TableView<Mahasiswa1> tableMahasiswa;

    @FXML
    private TableColumn<Mahasiswa1, String> nimColumn;

    @FXML
    private TableColumn<Mahasiswa1, String> namaColumn;

    @FXML
    public void initialize() {
        ObservableList<Mahasiswa1> mahasiswaList = DataProvider.getMahasiswaList();
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tableMahasiswa.setItems(mahasiswaList);
    }
}