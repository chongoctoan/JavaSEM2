package mutilpage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import mutilpage.Main;

public class Controller {
    public void goToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Main.rootStage.setTitle("Danh Sách Môn Học");
        Main.rootStage.setScene(listScene);
    }
}
