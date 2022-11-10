package ExamJava2.addStudent;

import ExamJava2.entities.Student;
import ExamJava2.rootStage.RootStage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;




public class AddStudentController {
    public TextField txPhone;
    public TextField txName;
    public TextField txAddress;
    public TextField txId;
    public static Student addStudent;
    public static ObservableList<Student> listStudent  = FXCollections.observableArrayList();

    public void add(ActionEvent actionEvent) {
        try {
            Integer id = Integer.parseInt(txId.getText());
            String name = txName.getText();
            String address = txAddress.getText();
            Integer phone = Integer.parseInt(txPhone.getText());
            Student st = new Student(id,name,address,phone);
            listStudent.add(st);
            back(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Parent backHome = FXMLLoader.load(getClass().getResource("../home.fxml"));
        RootStage.rootStage.setTitle("Back");
        RootStage.rootStage.setScene(new Scene(backHome,800,600));
    }
}