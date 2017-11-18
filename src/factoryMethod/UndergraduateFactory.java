package factoryMethod;

/**
 * 具体大学生工厂
 * Created by Administrator on 2017/10/18.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
