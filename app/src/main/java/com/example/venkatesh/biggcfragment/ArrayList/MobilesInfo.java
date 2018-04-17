package com.example.venkatesh.biggcfragment.ArrayList;

public class MobilesInfo {
  private  String Title,Price,Description,Color,Key,Imageurl;
    public MobilesInfo()
    {

    }
    public MobilesInfo(String key, String Title, String Price, String Description, String Color, String ImageUrl)
    {
        this.Key=key;
        this.Title=Title;
        this.Description=Description;
        this.Color=Color;
        this.Imageurl=ImageUrl;
        this.Price=Price;

    }

    public String getColor() {
        return Color;
    }

    public String getDescription() {
        return Description;
    }

    public String getPrice() {
        return Price;
    }

    public String getImageurl() {
        return Imageurl;
    }

    public String getKey() {
        return Key;
    }

    public String getTitle() {
        return Title;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setImageurl(String imageurl) {
        Imageurl = imageurl;
    }

    public void setKey(String key) {
        Key = key;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
