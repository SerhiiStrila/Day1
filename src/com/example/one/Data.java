package com.example.one;


public class Data {
    int imageID;
    String text;


    public Data(int imageID,String text){
        super();
        this.imageID = imageID;
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public int getImageId() {
        return imageID;
    }
}