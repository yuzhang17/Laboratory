package javaTesting;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchTest {
    void testJava8TryCatch() {
        try(InputStreamReader reader = new InputStreamReader(System.in)) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void testJava9TryCatch() {
        InputStreamReader reader = new InputStreamReader(System.in);
        InputStreamReader reader2 = new InputStreamReader(System.in);
        try(reader;reader2) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
