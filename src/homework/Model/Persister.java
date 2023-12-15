package homework.Model;

public class Persister{

    public <T extends User> void save(T t){
        System.out.println("Save user: " + t.getName());
    }
}
