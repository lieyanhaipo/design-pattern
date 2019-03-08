package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  解释器模式
 * @Author libing
 * @Date 2019/3/8
 **/
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<Expression> expressions = new ArrayList<Expression>();
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new TerminalExpression());
        for(Expression exp : expressions){
            exp.interpret(context);
        }
    }
}
