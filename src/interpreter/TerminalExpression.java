package interpreter;

/**
 * @Description
 * @Author libing
 * @Date 2019/3/8
 **/
public class TerminalExpression implements Expression{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
