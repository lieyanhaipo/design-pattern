package abstractFactory;

public interface IUser {
    void insert(User user);

    User getUser(Integer id);
}