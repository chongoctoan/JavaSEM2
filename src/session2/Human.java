package session2;

public class Human {
    String name;
    public Human(){

    }
    public Human(String name){
        this.name = name ;
    }
    public void run(){
        System.out.println("Run 5km/h");
    }
    public void run(int x){
        System.out.println("Run 10km/h");
    }
    public void run(String y){
        System.out.println("Run 15km/h");
    }
    public void run (String x,int y){
        System.out.println("Run 20km/h");
    }
    public void run (int x,String y){
        System.out.println("Run 30km/h");

    }
}
