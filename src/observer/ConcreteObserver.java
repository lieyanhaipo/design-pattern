package observer;

public class ConcreteObserver implements Observer{
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(name);
        System.out.println(observerState);
    }
}
