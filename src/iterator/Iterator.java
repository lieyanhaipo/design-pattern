package iterator;

/**
 * 迭代器模式
 */
public interface Iterator {
    Object first();
    Object next();
    Boolean isDone();
    Object currentItem();
}
