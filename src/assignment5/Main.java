package assignment5;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        News n = new News(1,"tieu de","1-1","hoang","aloalo");
        n.Display();

        n.RateList[0]=1;
        n.RateList[1]=2;
        n.RateList[2]=3;
        n.Calculate();
    }
}