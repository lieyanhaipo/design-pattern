package Memento;

/**
 * @author libing
 * @desc
 * @date 2017/12/11 16:20
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
