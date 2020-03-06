package solid_2011.live.lsp;

import java.util.*;

public abstract class AbstractSet<T> {
    protected java.util.Set innerSet = new LinkedHashSet();

    public AbstractSet() {
    }

    public int size() {
        return innerSet.size();
    }

    public abstract void add(final T element) throws Exception;


    public boolean isMember(final T element)
        {
            return innerSet.contains(element);
        }



}