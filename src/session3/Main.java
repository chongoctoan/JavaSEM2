package session3;
import assignment2.Account;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        d.eat();
        BullDog bd = new BullDog();
        bd.run();
    }
    public static void main2(String[] args){
        int[] intarrays = new int[5];
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Hello World");
        arrayList.add(new Account());
        arrayList.remove(0);
        arrayList.remove("Hello World");

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("Hello");
        strArray.add("World");
//2 cách
        for (String s: strArray){ // cách1
            System.out.println(s);
        }
        for (int i=0;i<strArray.size();i++){ //cách2
            System.out.println(strArray.get(i));
        }

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(11);

    }
}
