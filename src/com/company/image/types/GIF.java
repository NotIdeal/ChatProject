package com.company.image.types;

public class GIF extends Image{

    public GIF(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public String getInfo(){
        return("The image: " + super.getName() + ".gif");
    }
}
