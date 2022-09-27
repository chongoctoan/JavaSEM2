package assignment4;

public abstract class Phone {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("So1","1111");
        pb.insertPhone("So2","2222");
        pb.insertPhone("So2","3333");
        for (String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }

    public abstract void insertPhone(String name, String Phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name,String oldPhone, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
