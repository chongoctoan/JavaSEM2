package assignment4;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String Phone) {
        if (PhoneList.isEmpty()){
            PhoneList.add(name + "," + Phone);
        }else {
            boolean coSo=false;
            for (String pb : PhoneList){
                if (pb.contains(name+",")){
                    coSo=true;
                if (pb.contains(Phone)){
                    PhoneList.set(PhoneList.indexOf(pb),pb +":"+Phone);
                }
                break;
                }
            }
            if (!coSo){
                PhoneList.add(name + "," + Phone);
            }
        }
    }

    @Override
    public void removePhone(String name) {
        if (PhoneList.isEmpty()){
            System.out.println("Danh Bạ Trống");
        }else {
            boolean timThay= false;
            for (String pb : PhoneList){
                if (pb.contains(name+",")){
                    timThay=true;
                    PhoneList.remove(pb);
                    System.out.println("Đã xóa người dùng "+name+"khỏi danh bạ");
                    break;
                }
            }
            if (!timThay){
                System.out.println("Không tìm thấy người dùng"+name+"trong dnah bạ");
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }
}
