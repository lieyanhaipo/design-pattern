package iterator;

import javax.naming.event.ObjectChangeListener;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.setItem(0, "大鸟");
        concreteAggregate.setItem(1, "小菜");
        concreteAggregate.setItem(2, "小丽");
        concreteAggregate.setItem(3, "小王");

        Iterator i = new ConcreteIterator(concreteAggregate);
        Object item = i.first();
        while(!i.isDone()){
            System.out.println(i.currentItem());
            i.next();
        }
    }
}
