package facade;

/**
 * Created by Administrator on 2017/11/9.
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void MethodA(){
        one.MethodOne();
        two.MethodTwo();
    }

    public void MethodB(){
        three.MethodThree();
        four.MethodFour();
    }
}
