package responsibility;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request <10){
            System.out.println("[0-10)处理请求");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
