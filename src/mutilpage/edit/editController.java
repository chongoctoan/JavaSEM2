package mutilpage.edit;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import mutilpage.Main;
import mutilpage.Subject;
import mutilpage.list.Controller;

import java.net.URL;
import java.util.ResourceBundle;

public class editController implements Initializable {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        try {
            if(mutilpage.list.Controller.editItem == null){
                goToList(null);
            }
            txtCode.setText(mutilpage.list.Controller.editItem.getCode());
            txtName.setText(mutilpage.list.Controller.editItem.getName());
            txtHours.setText(mutilpage.list.Controller.editItem.getHours().toString());
            txtCode.setEditable(false);
        }catch (Exception e){

        }

    }

    public void goToList(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Danh sách môn học");
        Main.rootStage.setScene(listScene);
    }

    public void submit(ActionEvent actionEvent) {
            try {
                int hours = Integer.parseInt(txtHours.getText());
                if(txtName.getText().isEmpty() || hours < 0){
                    throw new Exception("Vui lòng nhập dữ liệu");
                }
                Controller.editItem.setName(txtName.getText());
                Controller.editItem.setHours(hours);
                goToList(null);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
