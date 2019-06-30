package com.example.youssef.ar_foods;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class foodtypes {

   private int imageView;
    private   String typename;

    public foodtypes(int imageView, String typename)
    {
        this.imageView=imageView;
        this.typename=typename;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }




}
