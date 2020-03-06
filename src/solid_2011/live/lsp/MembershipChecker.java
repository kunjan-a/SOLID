package solid_2011.live.lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 12, 2011
 * Time: 1:05:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MembershipChecker {

    public static boolean check(List elements, AbstractSet uniqueElements) {
        for (Object element : elements) {
            try {
                if (!uniqueElements.isMember(element))
                    return false;
            } catch (Exception e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List elements = new ArrayList() {{
            add("a");
            add("b");
            add("c");
        }};

        AbstractSet uniqueElements = new PersistentSet();
        try {
            uniqueElements.add("c");
            uniqueElements.add("b");
            uniqueElements.add("a");
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println("Check1: " + MembershipChecker.check(elements, uniqueElements));

        List anotherElements = new ArrayList() {{
            add("a");
            add("c");
            add("d");
        }};
        System.out.println("Check2: " + MembershipChecker.check(anotherElements, uniqueElements));
    }
}
