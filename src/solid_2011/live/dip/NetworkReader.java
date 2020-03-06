package solid_2011.live.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/6/12
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class NetworkReader implements Reader {
    URL url = null;

    public NetworkReader(String protocol, String host, String path) throws MalformedURLException {
        url = new URL(protocol, host, path);
    }

    @Override
    public String read() throws IOException {
        InputStream in = null;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        return inputString1.toString();
    }
}
