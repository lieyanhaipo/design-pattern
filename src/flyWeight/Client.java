package flyWeight;

/**
 * @Description  享元模式
 * @Author libing
 * @Date 2019/3/8
 **/
public class Client {
    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyweightFactory ff = new FlyweightFactory();
        Flyweight fx = ff.getFlywight("x");
        fx.operation(extrinsicstate);

        Flyweight fy = ff.getFlywight("y");
        fy.operation(extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(extrinsicstate);
    }
}
