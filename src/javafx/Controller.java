package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField FullName;
    public TextField Email;
    public TextField Age;
    public TextField Address;


    public Text txtName;
    public Text txtEmail;
    public Text txtAge;
    public Text txtAddress;

    public Text noticeFullName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;

    public void handlesubmit(){
        String fn = FullName.getText();
        if(fn.isEmpty()){
            noticeFullName.setText("Vui lòng nhập họ tên");
            noticeFullName.setVisible(true);
        }else {
            FullName.setText(fn);
            noticeFullName.setVisible(false);
        }
        String ag = txtAge.getText();
        try {
            Integer nAge = Integer.parseInt(ag);
            if(nAge <= 0 || nAge>100)
                throw new Exception("Vui lòng nhập tuổi hợp lệ");
            Age.setText(nAge.toString());
            noticeAge.setVisible(false);
        }catch (Exception e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(true);
        }

        String em = txtEmail.getText();
        if(em.isEmpty() || !em.contains("@")
                || em.startsWith("@") || em.endsWith("@")){
            noticeEmail.setText("Vui lòng nhập vào một email");
            noticeEmail.setVisible(true);
        }else{
            noticeEmail.setVisible(false);
            Email.setText(em);
        }

        String ad = txtAddress.getText();
        if(ad.isEmpty() || ad.length() < 10){
            noticeAddress.setText("Vui lòng nhập vào một địa chỉ");
            noticeAddress.setVisible(true);
        }else{
            noticeAddress.setVisible(false);
            Address.setText(ad);
        }
    }


}