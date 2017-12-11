package Memento;

/**
 * @author libing
 * @desc 备忘录
 * @date 2017/12/11 16:11
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
