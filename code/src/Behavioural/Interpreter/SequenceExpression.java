package Behavioural.Interpreter;

public class SequenceExpression extends RegularExpression {
    private RegularExpression firstExpression;
    private RegularExpression secondExpression;

    @Override
    public boolean isMatch(String toMatch) {
        return firstExpression.isMatch(toMatch)
                && secondExpression.isMatch(toMatch); // And the order matches
    }

    public RegularExpression getFirstExpression() {
        return firstExpression;
    }

    public void setFirstExpression(RegularExpression firstExpression) {
        this.firstExpression = firstExpression;
    }

    public RegularExpression getSecondExpression() {
        return secondExpression;
    }

    public void setSecondExpression(RegularExpression secondExpression) {
        this.secondExpression = secondExpression;
    }
}
