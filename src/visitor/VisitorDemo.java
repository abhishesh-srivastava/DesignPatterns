package visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {

    public static void performDemo() {
        Visitor visitor = new VisitorImpl();
        VisitorElementA elementA = new VisitorElementA(5);
        VisitorElementB elementB = new VisitorElementB(123123124L);
        VisitorElementC elementC = new VisitorElementC(12.12f);
        List<BaseElement> visitorList = new ArrayList<>();
        visitorList.add(elementA);
        visitorList.add(elementB);
        visitorList.add(elementC);
        visitor.performOperation(visitorList);
    }
}
