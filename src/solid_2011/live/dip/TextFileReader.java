package solid_2011.live.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/6/12
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextFileReader implements Reader {
    String fileName;

    public TextFileReader(String fileName) {
        this.fileName = fileName;
    }


    public String read() throws IOException {
        StringBuilder readString = new StringBuilder();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(fileName));
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            readString.append(aLine);
        }
        reader.close();

        return readString.toString();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
