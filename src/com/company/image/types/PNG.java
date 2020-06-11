package com.company.image.types;

public class PNG extends Image {
    public PNG(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public String getInfo(){
        return ("The image: " + super.getName() + ".png");
    }
}
