package templateMethod;

/**
 * 设计模式-抽象模板方法
 * Created by Administrator on 2017/11/8.
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
