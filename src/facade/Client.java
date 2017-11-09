package facade;

/**
 * Created by Administrator on 2017/11/9.
 */
public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.MethodA();
        facade.MethodB();
    }
}
