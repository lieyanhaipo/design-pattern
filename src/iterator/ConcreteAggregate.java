package iterator;

import javax.naming.event.ObjectChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<Object>();

//    @Override
//    public Iterator createIterator() {
//        return new ConcreteIterator(this);
//    }

    public int count() {
        return items.size();
    }

    public Object getItem(int index){
        return items.get(index);
    }

    public void setItem(int index, Object value){
        items.add(index, value);
    }
}
