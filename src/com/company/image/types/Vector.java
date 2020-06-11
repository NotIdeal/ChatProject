package com.company.image.types;

public class Vector extends Image{
    public Vector(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public String getInfo(){
        return ("The image: " + super.getName() + ".svg");
    }
}
