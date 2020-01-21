package behavioral.interperter;

public class AndExpression implements Expression {

    private Expression expression_1;
    private Expression expression_2;

    public AndExpression(Expression expression_1, Expression expression_2) {
        this.expression_1 = expression_1;
        this.expression_2 = expression_2;
    }

    @Override
    public boolean interpret(String context) {
        return expression_1.interpret(context) && expression_2.interpret(context);
    }
}
