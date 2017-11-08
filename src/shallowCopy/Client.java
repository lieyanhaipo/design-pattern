package shallowCopy;

/**
 * Created by Administrator on 2017/11/8.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000 ","A公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006 ","B公司");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("1998-2010 ","C公司");

        a.display();
        b.display();
        c.display();
    }
}
