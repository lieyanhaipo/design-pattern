package prototype;

/**
 * Created by Administrator on 2017/10/18.
 */
public class ConcretePortotype1 extends Prototype {
    public ConcretePortotype1(String id){
        super(id);
    }

    @Override
    public Prototype clone(){
        return super.clone();
    }
}
