package composite;

/**
 * 组合部件（Component）：它是一个抽象角色，为要组合的对象提供统一的接口。
 * 《设计模式》一书中提倡：相对于安全性，我们比较强调透明性。
 * 对于第一种方式中叶子节点内不需要的方法可以使用空处理或者异常报告的方式来解决
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    protected abstract void add(Component component);
    protected abstract void remove(Component component);
    protected abstract void display(int depth);
}
