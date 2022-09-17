package session2;

import session1.Car;

import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Car c = new Car();
        Human h = new Human();
        h.run(5);
        h.run("Chó đuổi");
        h.run(10,"Chó đuổi");
        h.run("Chó đuổi",10);

        Human h2 = new Human("Nguyễn Tuấn Anh");
        System.out.println(h2.name);

//        Scanner sc = new Scanner(System.in);
        Student s = new Student("Nguyễn Văn An","02312312","8 tôn thất thuyêt",22);
        s.girlfriend[0] = "Ngọc TRinh";
        s.girlfriend[1] = "Thị Nở";
        s.myCar = new Car();

        int[] marks = new int[4];
        marks[0] = 10;

        Student[] students = new Student[10];
        students[0] = new Student("Nguyễn Thị Hà","33312323","8 tôn thất thuyêt",22);

        for (int i = 0;i<students.length;i++){
            students[i] = new Student();
        }
        //set 10 sinh vien theo do tuoi tư 20 -> 29
        for (int i = 0;i<students.length;i++){
            students[i].setAge(i+20);
        }
        for (int i = 0;i<students.length;i++){
            System.out.println(students[i].getAge());
        }
        for (Student st : students){ //foreach
            System.out.println(st.getAge());//st <=> students[i]
        }
    }
}
