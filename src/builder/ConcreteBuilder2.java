package builder;

/**
 * Created by Administrator on 2017/11/10.
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件x");
    }

    @Override
    public void buildPartB() {
        product.add("部件y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
