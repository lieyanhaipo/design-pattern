package decorator;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
