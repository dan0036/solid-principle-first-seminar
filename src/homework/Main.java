package homework;

import homework.Model.Persister;
import homework.Model.User;
import homework.impl.UserReport;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserReport report = new UserReport();
        report.report(user);
        Persister persister = new Persister();
        persister.save(user);
    }
}