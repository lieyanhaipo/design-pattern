package flyWeight;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/8
 **/
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体FlyWeight:"+extrinsicState);
    }
}
