package simpleFactory;

/**
 * Created by Administrator on 2017/10/18.
 */
public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type){
        LeiFeng result = null;
        if(type.equals("学雷锋的大学生")){
            result = new Undergraduate();
        }else if(type.equals("社区志愿者")){
            result = new Volunteer();
        }
        return result;
    }
}
