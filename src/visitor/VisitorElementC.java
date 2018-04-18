package visitor;

public class VisitorElementC implements BaseElement {
    private float price;

    public VisitorElementC(float value) {
        price = value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.performOperation(this);
    }

    public float getFloatPrice() {
        return price;
    }

}
