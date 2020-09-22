package javaTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStream {
    void transferTo() throws FileNotFoundException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream("hello.txt");
        final FileOutputStream os = new FileOutputStream("helloCopy.txt");

        try(is; os) {
            is.transferTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
