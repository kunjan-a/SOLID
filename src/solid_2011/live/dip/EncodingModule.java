package solid_2011.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {

    public void encode(Reader src, Writer dest) throws IOException{
        String aLine = src.read();
        String encodedLine = Base64.encodeBytes(aLine.getBytes());
        dest.write(encodedLine);
    }
}

