package factoryMethod;

/**
 * 具体志愿者工厂
 * Created by Administrator on 2017/10/18.
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
