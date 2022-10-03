package javafxAssignment1;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class ContactController {
    public TextField txtName;
    public TextField txtPhone;
    public Text result;
    public Text errors;

    private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public void addContact(){
        try {
            errors.setVisible(false);
            if(txtName.getText().isEmpty() || txtPhone.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên và số điện thoại");
            }
//            phoneList.add(new PhoneNumber(txtName.getText(),txtPhone.getText()));
            updatePhone();
//            String n = txtName.getText();
//            String p = txtPhone.getText();
//            PhoneNumber pn = new PhoneNumber(n,p);
//            phoneList.add(pn);
            printResult();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }
    }

    public void updatePhone(){
        for(PhoneNumber p:phoneList){
            if(p.getName().equals(txtName.getText())){
                p.setPhone(txtPhone.getText());
                return;
            }
        }
        phoneList.add(new PhoneNumber(txtName.getText(),txtPhone.getText()));
    }

    public void printResult(){
        String txt = "";
        for (PhoneNumber p: phoneList){
            txt += p.toString();
        }
        result.setText(txt);
    }

}