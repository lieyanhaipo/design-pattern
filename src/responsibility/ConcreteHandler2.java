package responsibility;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 10 && request < 20){
            System.out.println("[10-20)处理请求");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
