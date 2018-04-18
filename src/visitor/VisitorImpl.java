package visitor;

import java.util.Collection;
import java.util.Iterator;

public class VisitorImpl implements Visitor {

    @Override
    public void performOperation(VisitorElementA elem) {
        System.out.println("Price is " + elem.getIntPrice());
    }

    @Override
    public void performOperation(VisitorElementB elem) {
        System.out.println("Price is " + elem.getLongPrice());
    }

    @Override
    public void performOperation(VisitorElementC elem) {
        System.out.println("Price is " + elem.getFloatPrice());
    }

    @Override
    public void performOperation(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if(object instanceof BaseElement){
                System.out.println("Base Element, will be visited");
                ((BaseElement)object).accept(this);
            }
            else if (object instanceof Collection){
                System.out.println("Collection, will be visited");
                performOperation((Collection) object);
            }
        }
    }

}
