package solid_2011.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/6/12
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextFileWriter implements Writer {

    private String fileName;

    public TextFileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String toWrite) throws IOException {
        fileName = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(toWrite);
        writer.flush();
        writer.close();
    }
}
