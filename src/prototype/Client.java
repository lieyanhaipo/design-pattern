package prototype;

/**
 * Created by Administrator on 2017/10/25.
 */
public class Client {
    public static void main(String[] args){
        ConcretePortotype1 p1 = new ConcretePortotype1("1");
        ConcretePortotype1 c1 = (ConcretePortotype1) p1.clone();
        System.out.println(c1.getId());
    }
}
