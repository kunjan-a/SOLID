package solid_2011.live.dip;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/6/12
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseWriter implements Writer {

    private MyDatabase database;

    public DatabaseWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String toWrite) throws IOException {
        database.write(toWrite);
    }
}
