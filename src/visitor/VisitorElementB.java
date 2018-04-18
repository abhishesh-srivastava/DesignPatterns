package visitor;

public class VisitorElementB implements BaseElement {
    private long price = 0L;

    public VisitorElementB(long value) {
        price = value;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.performOperation(this);
    }

    public long getLongPrice() {
        return price;
    }
}
