package composite;


/**
 * @Description 叶子（Leaf）：在组合中表示子节点对象，叶子节点不能有子节点。
 * @Author libing
 * @Date 2019/3/1
 **/
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int depth) {
        System.out.println("-"+String.valueOf(depth)+ name);
    }
}
