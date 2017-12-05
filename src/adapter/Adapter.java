package adapter;

/**
 * 适配器
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specialRequest();
    }
}
