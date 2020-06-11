package com.company.test;

import com.company.Media;
import com.company.Message;
import com.company.reader.*;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class MessageTester {
    @Test
    public void toStringMessageTest(){
        int id = 1;
        String text = "Hello!";
        Media media = new Media(360, "lol");
        File file = new File(new FileReader("oppa"));
        Date date = new Date();
        Message cnt = new Message(text, media, file);
        cnt.setId(id);
        cnt.setDate(date);

        assertEquals("Message{" + "id=" + id + ", text='" + text + '\'' +
                ", media=" + media +
                ", file=" + file +
                ", date=" + date +
                '}', cnt.toString());
    }
}
