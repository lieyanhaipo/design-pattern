package builder;

/**
 * 建造者
 * Created by Administrator on 2017/11/10.
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
