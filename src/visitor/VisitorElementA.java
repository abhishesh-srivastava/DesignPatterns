package visitor;

public class VisitorElementA implements BaseElement {
    private int price;

    public VisitorElementA(int value) {
        price = value;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.performOperation(this);
    }

    public int getIntPrice() {
        return price;
    }
}
