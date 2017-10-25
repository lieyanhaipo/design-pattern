package prototype;

/**
 * 原型类
 * Created by Administrator on 2017/10/18.
 */
public class Prototype implements Cloneable{
    private String id;

    public Prototype(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
