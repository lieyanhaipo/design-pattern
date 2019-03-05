package singleton;

/**
 * @Description 单例模式
 * @Author libing
 * @Date 2019/3/5
 **/
public class LazySingleton {
    private static LazySingleton singleton;

    /**
     * 私有构造方法
     */
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
