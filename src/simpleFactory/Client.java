package simpleFactory;

/**
 * Created by Administrator on 2017/10/18.
 */
public class Client {
    public static void main(String[] args){
        LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentA.buyRice();

        // 坏味道
        LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentB.sweep();

        LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentC.wash();
    }
}
