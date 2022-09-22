package session3;

public class Dog extends Animal {
    public int year;

    public Dog() {

    }

    public Dog(int year) {
        this.year = year;
    }

    public Dog(int id, String name, int year) {
        super(id, name);
        this.year = year;
    }

    public void eat(){
        super.run();
        System.out.println("Ăn...");
    }
    public void run(){
        super.run();
        System.out.println("Dog Run...");
    }
}
