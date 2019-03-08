package flyWeight;

import java.util.Hashtable;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/8
 **/
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

//    public FlyweightFactory() {
//        flyweights.put("x", new ConcreteFlyweight());
//        flyweights.put("y", new ConcreteFlyweight());
//        flyweights.put("z", new ConcreteFlyweight());
//    }

    public Flyweight getFlywight(String key){
        if(!flyweights.contains(key)){
            flyweights.put(key, new ConcreteFlyweight());
        }
        return (Flyweight) flyweights.get(key);
    }
}
