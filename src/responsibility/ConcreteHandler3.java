package responsibility;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.println("[20-30)处理请求");
        }else if(successor != null){
            //转移到下一位
            successor.handleRequest(request);
        }
    }
}
