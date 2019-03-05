package birdge;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
