package builder;

/**
 * Created by Administrator on 2017/11/10.
 */
public class Client {
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
