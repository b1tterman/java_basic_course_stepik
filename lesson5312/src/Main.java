import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws Exception{
        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int nRead;
        while ((nRead = inputStream.read(buffer)) != -1) {
            out.write(buffer, 0, nRead);
        }
        return new String(out.toByteArray(), charset);
    }
}

