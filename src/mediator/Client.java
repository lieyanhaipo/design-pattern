package mediator;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        colleague1.send("吃过饭了吗?");
        colleague2.send("没有呢,你打算请客?");
    }
}
