package Memento;

import javax.swing.*;

/**
 * @author libing
 * @desc  发起人
 * @date 2017/12/11 16:16
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }

    //恢复备忘录
    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("state="+state);
    }
}
