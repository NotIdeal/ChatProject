package com.company.image.types;

public class JPEG extends Image {

    public JPEG(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public String getInfo(){
        return ("The image: " + super.getName() + ".jpeg");
    }
}
