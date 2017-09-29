package decorator;

/**
 * 装饰器模式
 * Created by Administrator on 2017/9/29.
 */
public class Main {
    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        //装饰方法：实例化对象d1包装c,再用d2包装d1,最后执行d2的Operation
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
