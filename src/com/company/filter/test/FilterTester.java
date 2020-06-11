package com.company.filter.test;
import com.company.emuns.Gender;
import com.company.emuns.MaritalStatus;
import com.company.emuns.Status;
import com.company.filter.*;
import com.company.user.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterTester {
    @Test
    public void filterByDivorcedTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(c);

        Filter cnt = new FilterByDivorced();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterBySingleTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        Filter cnt = new FilterBySingle();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterByWidowedTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        Filter cnt = new FilterByWidowed();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterByMarriedTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Sam","David", "1LoveSally", Gender.MALE, 27, MaritalStatus.MARRIED, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(b);
        Filter cnt = new FilterByMarried();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterByFemaleTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        Filter cnt = new FilterByFemale();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterByMaleTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(c);
        Filter cnt = new FilterByMale();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterByOfflineTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(c);
        Filter cnt = new FilterByOffline();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterByOnlineTest(){
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        Filter cnt = new FilterByOnline();
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterOrTest(){
        Filter male = new FilterByMale();
        Filter single = new FilterBySingle();
        ORFilter cnt = new ORFilter(male, single);
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        ans.add(c);
        assertEquals(ans, cnt.filter(users));
    }
    @Test
    public void filterAndTest(){
        Filter male = new FilterByMale();
        Filter single = new FilterBySingle();
        ANDFilter cnt = new ANDFilter(male, single);
        List<User> users = new ArrayList<User>();
        User a = new User("Umit","Kumarova", "Unit", Gender.FEMALE, 18, MaritalStatus.SINGLE, Status.ONLINE);
        User b = new User("Aruzhan","Amangeldieva", "Lily", Gender.FEMALE, 19, MaritalStatus.SINGLE, Status.ONLINE);
        User c = new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE);
        users.add(a);
        users.add(b);
        users.add(c);
        List<User> ans = new ArrayList<>();
        assertEquals(ans, cnt.filter(users));
    }
}
