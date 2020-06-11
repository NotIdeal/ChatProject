package com.company.image.test;

import com.company.image.types.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageTypeTester {
    @Test
    public void TestImageGIF(){
        Image a = new GIF(360, "A");
    }
    @Test
    public void TestImageJPEG(){
        Image b = new JPEG(360, "B");
        assertEquals("The image: B.jpeg", b.getInfo());
    }
    @Test
    public void TestImagePNG(){
        Image c = new PNG(360, "C");
        assertEquals("The image: C.png", c.getInfo());
    }
    @Test
    public void TestImageSVG(){
        Image d = new Vector(360, "D");
        assertEquals("The image: D.svg", d.getInfo());
    }
}
