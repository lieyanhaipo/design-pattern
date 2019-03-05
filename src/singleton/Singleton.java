package singleton;

import sun.security.jca.GetInstance;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
