package com.company.channel;

import com.company.Message;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Subscriber> subscribers;

    public Channel(){
        subscribers = new ArrayList<Subscriber>();
    }

    public int numberOfSubscribers(){
        return this.subscribers.size();
    }
    @Override
    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers(Message m) {
        for (int i = 0; i < subscribers.size(); i++) {
            Subscriber subscriber = (Subscriber) subscribers.get(i);
            System.out.println(subscriber.update(m));
        }
    }
}