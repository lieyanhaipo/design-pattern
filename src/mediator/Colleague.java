package mediator;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/5
 **/
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
