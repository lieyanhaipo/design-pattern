package shallowCopy;

/**
 * Created by Administrator on 2017/11/8.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name){
        this.name = name;
        work = new WorkExperience();
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String workDate,String company){
        work.WorkDate = workDate;
        work.Company = company;
    }

    //显示
    public void display(){
        System.out.println("工作经历："+work.WorkDate+work.Company);
    }

    protected Object clone() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }
}
