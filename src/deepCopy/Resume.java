package deepCopy;

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

    private Resume(WorkExperience work) throws CloneNotSupportedException{
        this.work = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String name, String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate,String company){
        work.WorkDate = workDate;
        work.Company = company;
    }

    public void display(){
        System.out.println("工作经历："+work.WorkDate+work.Company);
    }

    public Object clone() throws CloneNotSupportedException{
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
