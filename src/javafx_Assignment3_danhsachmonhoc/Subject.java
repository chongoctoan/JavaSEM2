package javafx_Assignment3_danhsachmonhoc;

public class Subject {
    String name;
    String classes;

    public Subject(String name,String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return getName()+"\t"+getClasses();
    }
}
