package Behavioural.Interpreter;

public class LiteralExpression extends RegularExpression {
    private String literal;

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean isMatch(String toMatch) {
        // Either a or b
        boolean match = toMatch.contains(literal);
        return match;
    }
}
