package factoryMethod;

/**
 * Created by Administrator on 2017/10/18.
 */
public class Client {
    public static void main(String[] args){
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
