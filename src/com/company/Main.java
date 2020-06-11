package com.company;

import com.company.chat.IndividualChat;
import com.company.user.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            Database.connect();
            //Group chat
            /*Member user1 = Member.getMember("erzhan", "arman");
            Member user2 = Member.getMember("rakhad", "123");
            ArrayList<Member> list = new ArrayList<>();
            list.add(user1);
            list.add(user2);
            Message message = new Message("HI");
            Message message2 = new Message("HI");
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(message);
            messages.add(message2);
            new GroupChat(messages,list);*/

            //Individual chat
            Member user3 = Member.getMember("rakhadkz", "");
            Member user4 = Member.getMember("arman", "123");
            ArrayList<Message> messages1 = new ArrayList<>();
            IndividualChat individualChat = new IndividualChat(messages1);
            individualChat.setUser1(user3);
            individualChat.setUser2(user4);
            user3.sendMessage(new Message("Hi"));
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
