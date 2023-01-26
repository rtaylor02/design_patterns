package Behavioural.Interpreter;

public class TestDrive {
    public static void main(String[] args) {
        // (a & b)
        LiteralExpression firstExpression = new LiteralExpression();
        firstExpression.setLiteral("a");
        LiteralExpression secondExpression = new LiteralExpression();
        secondExpression.setLiteral("b");

        SequenceExpression parent = new SequenceExpression();
        parent.setFirstExpression(firstExpression);
        parent.setSecondExpression(secondExpression);

        parent.isMatch("ab");
        parent.isMatch("b");
    }
}
