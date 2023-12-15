package homework.impl;

import homework.Model.User;
import homework.Reportable;

public class UserReport implements Reportable {

    @Override
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }

}
