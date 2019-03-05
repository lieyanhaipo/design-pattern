package birdge;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
