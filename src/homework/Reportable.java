package homework;

import homework.Model.User;

public interface Reportable<T extends User> {

    void report(T t);
}
