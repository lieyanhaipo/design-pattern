package abstractFactory;

public class Client {
    public static void main(String[] args){
        User user = new User();
        IFactory factory = new SqlserverFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);
    }
}
