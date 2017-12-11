package Memento;

/**
 * @author libing
 * @desc  管理者
 * @date 2017/12/11 16:14
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
