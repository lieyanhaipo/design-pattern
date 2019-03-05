package birdge;

/**
 * @Description  桥接模式将抽象部分与实现部分分离
 * @Author libing
 * @Date 2019/3/5
 **/
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
