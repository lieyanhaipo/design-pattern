package decorator;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addBehavior(){

    }
}
