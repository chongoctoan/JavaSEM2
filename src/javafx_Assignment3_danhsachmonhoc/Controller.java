package javafx_Assignment3_danhsachmonhoc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    public TextField txtName;
    public TextField txtClass;
    public Text errors;
    public ListView<Subject> lv;

    private ObservableList<Subject> listsubject = FXCollections.observableArrayList();
    public void addSubJect(ActionEvent actionEvent) {
        try {
            errors.setVisible(false);
            if (txtName.getText().isEmpty() || txtClass.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đủ tên môn và lớp học");
            }
                listsubject.add(new Subject(txtName.getText(),txtClass.getText()));

            lv.setItems(listsubject);
            lv.refresh();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }

    }

    public void addFixSubJect(ActionEvent actionEvent) {
    }

}


