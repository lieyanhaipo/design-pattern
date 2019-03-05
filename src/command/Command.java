package command;

/**
 * @Description 用来声明执行操作
 * @Author libing
 * @Date 2019/3/5
 **/
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void Execute();
}
