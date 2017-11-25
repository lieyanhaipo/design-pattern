package observer;

import java.util.ArrayList;
import java.util.List;

/* 抽象通知者 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void note(){
        for (Observer o:observers
             ) {
            o.update();
        }
    }
}
