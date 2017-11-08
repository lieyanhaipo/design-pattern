package templateMethod;

import javax.print.DocFlavor;

/**
 * Created by Administrator on 2017/11/8.
 */
public class Client {
    public static void main(String[] args){
        AbstractClass c;

        c = new ConcreteClassA();
        c.templateMethod();

        c =new ConcreteClassB();
        c.templateMethod();
    }
}
