package responsibility;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public abstract class Handler {
    protected Handler successor;

    //设置继任者
    public void setSuccessor(Handler handler){
        this.successor = handler;
    }

    //处理请求的抽象方法
    public abstract void handleRequest(int request);
}
