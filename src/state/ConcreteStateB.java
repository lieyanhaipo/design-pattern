package state;

public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
        System.out.println("设置状态为A");
    }
}
