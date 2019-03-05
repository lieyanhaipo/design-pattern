package command;

/**
 * @Description  要求该命令执行这个请求
 * @Author libing
 * @Date 2019/3/5
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.Execute();
    }
}
