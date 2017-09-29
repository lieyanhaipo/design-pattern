package decorator;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ConcreteDecoratorA extends Decorator{
    private String addState;

    @Override
    public void operation() {
        super.operation();
        addState = "new state";
        System.out.println("具体装饰对象A的操作");
    }
}
