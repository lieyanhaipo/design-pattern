package proxy;


/**
 * Created by Administrator on 2017/10/17.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
