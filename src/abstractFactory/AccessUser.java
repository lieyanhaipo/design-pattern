package abstractFactory;

public class AccessUser implements IUser{
    public void insert(User user){
        System.out.println("access add one record");
    }

    public User getUser(Integer id){
        System.out.println("access 根据id或取一条记录");
        return null;
    }
}
