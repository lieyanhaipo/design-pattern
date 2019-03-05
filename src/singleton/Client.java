package singleton;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class Client {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        if(lazySingleton1 == lazySingleton2){
            System.out.println("lazySingleton两个对象是相同的实例");
        }

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1 == singleton2){
            System.out.println("两个对象是相同的实例");
        }


    }
}
