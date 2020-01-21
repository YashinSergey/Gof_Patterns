package behavioral.interperter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaCore = getJavaCoreExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does jun developer knows Java Core: " + isJavaCore.interpret("Java Core"));
        System.out.println("Does jun developer knows Java EE: " + isJavaCore.interpret("Spring"));

        System.out.println("------------------");

        System.out.println("Does senior developer knows Java EE: " + isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaCoreExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OreExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
