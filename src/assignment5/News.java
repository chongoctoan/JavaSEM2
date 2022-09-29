package assignment5;

import java.util.ArrayList;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public double AverageRate;

    int[] RateList = new int[3];

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public double getAverageRate() {
        return AverageRate;
    }

    public int[] getRateList() {
        return RateList;
    }

    public void setRateList(int[] rateList) {
        RateList = rateList;
    }

    @Override
    public void Display() {
        System.out.println(getTitle());
        System.out.println(getPublishDate());
        System.out.println(getAuthor());
        System.out.println(getContent());
        System.out.println(getAverageRate());
    }

    public void Calculate(){
        int a = 0;
        for (int rl: RateList) {
            a +=rl;
        }
        this.AverageRate = (a/3);
    }
}