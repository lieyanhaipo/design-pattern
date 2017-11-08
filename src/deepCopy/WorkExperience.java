package deepCopy;

/**
 * 工作经历类
 * Created by Administrator on 2017/11/8.
 */
public class WorkExperience implements Cloneable {
    private String workDate;
    public String WorkDate;

    private String company;
    public String Company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    protected Object clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}
