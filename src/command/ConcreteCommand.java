package command;

/**
 * @Description  将一个接受者对象绑定于一个动作,调用接收者相应的操作,以实现Execute
 * @Author libing
 * @Date 2019/3/5
 **/
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Execute() {
        receiver.Action();
    }
}
