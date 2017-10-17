package proxy;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Proxy implements Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if(null == realSubject){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
