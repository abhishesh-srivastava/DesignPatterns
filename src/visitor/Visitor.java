package visitor;

import java.util.Collection;

public interface Visitor {

    public void performOperation(VisitorElementA elem);

    public void performOperation(VisitorElementB elem);

    public void performOperation(VisitorElementC elem);

    public void performOperation(Collection collection);

}
