package flyWeight;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/8
 **/
public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体FlyWeight:"+extrinsicState);
    }
}
