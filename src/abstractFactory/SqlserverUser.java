package abstractFactory;

public class SqlserverUser implements IUser{
    public void insert(User user){
        System.out.println("sqlserver add one record");
    }

    public User getUser(Integer id){
        System.out.println("sqlserver 根据id或取一条记录");
        return null;
    }
}
