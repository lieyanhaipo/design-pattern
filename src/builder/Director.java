package builder;

/**
 * 指挥者
 * Created by Administrator on 2017/11/10.
 */
public class Director {
    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
