package com.company.channel.test;
import com.company.channel.*;
import com.company.Message;
import org.junit.Test;

import javax.security.auth.SubjectDomainCombiner;

import static org.junit.Assert.*;
public class channelFileTester {
    @Test
    public void TestUpdateSubscriber(){
        Channel cnt = new Channel();
        Subscriber a = new Subscriber(cnt, "A");
        Message b = new Message("Hi!");
        assertEquals("A, you got a new message: Hi!\nDate sent: " + b.getDate(), a.update(b));
    }
    @Test
    public void TestChannelSubscribers(){
        Channel cnt = new Channel();
        Subscriber a = new Subscriber(cnt, "A");
        assertEquals(1, cnt.numberOfSubscribers());
        cnt.removeSubscriber(a);
        assertEquals(0, cnt.numberOfSubscribers());
    }
}
