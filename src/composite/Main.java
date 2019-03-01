package composite;

/**
 * @Description  组合模式
 * @Author libing
 * @Date 2019/3/1
 **/
public class Main {
    public static void main(String[] args) {
        //根
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        //X枝
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);
        //X枝的分支
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);


        root.display(1);
    }
}
