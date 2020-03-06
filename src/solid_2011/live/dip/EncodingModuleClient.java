package solid_2011.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule  = new EncodingModule();
        encodingModule.encode(new TextFileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt"),new TextFileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"));
        encodingModule.encode(new NetworkReader("http", "myfirstappwith.appspot.com", "index.html"),new DatabaseWriter(new MyDatabase()));
    }
}
