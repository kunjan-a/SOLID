package solid_2011.live.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 12, 2011
 * Time: 12:51:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class UniqueCounter {
    private AbstractSet elements;

    public UniqueCounter(AbstractSet elements) {
        this.elements = elements;
    }

    public int execute()
    {
        try {
            elements.add("hello");
            elements.add(1);
            elements.add(3);
            elements.add("hello");
            elements.add(1);
        } catch(Exception e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        return elements.size();
    }

    public static void main(String[] args) {
        UniqueCounter counter = new UniqueCounter(new PersistentSet());
        System.out.println(counter.execute());
    }
}
