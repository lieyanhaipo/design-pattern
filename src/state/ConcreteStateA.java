package state;

public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
        System.out.println("设置状态为B");
    }
}
