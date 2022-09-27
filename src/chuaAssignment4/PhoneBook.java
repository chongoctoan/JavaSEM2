package chuaAssignment4;

import java.util.ArrayList;

public class PhoneBook extends assignment4.Phone {
    public ArrayList <assignment4.PhoneNumber> phoneList = new ArrayList<>();
    public PhoneBook(){
        phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : phoneList){
            if(p.getName().equals(phone)){
                if(p.getPhone().contains(phone)){
                    System.out.println("Lien lac da ton tai");
                    return;
                }
                p.getPhone().add(phone);
                System.out.println("Da them so vao danh ba co san");
                return;
            }
        }
        PhoneNumber pn = new PhoneNumber(name,phone);
        phoneList.add(pn);
    }