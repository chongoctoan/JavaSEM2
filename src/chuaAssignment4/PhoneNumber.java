package chuaAssignment4;


import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> phone;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = new ArrayList<>();// chuyen array thanh chuoi
        this.phone.add(phone);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }
}