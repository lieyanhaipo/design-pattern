package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  合成部件（Composite）：定义有枝节点的行为，用来存储部件，实现在Component接口中的有关操作，如增加（Add）和删除（Remove）。
 * @Author libing
 * @Date 2019/3/1
 **/
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    protected void add(Component component) {
        children.add(component);
    }

    @Override
    protected void remove(Component component) {
        children.remove(component);
    }

    @Override
    protected void display(int depth) {
        System.out.println('-'+String.valueOf(depth)+name);
        for (Component component: children
             ) {
            component.display(depth + 1);
        }
    }
}
