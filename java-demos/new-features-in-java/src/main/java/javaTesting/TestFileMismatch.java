package javaTesting;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestFileMismatch {
    public static void testFilesMismatch() throws IOException {
        FileWriter fileWriter = new FileWriter("tmp\\a.txt");
        fileWriter.write("a");
        fileWriter.write("b");
        fileWriter.write("c");
        fileWriter.close();
        FileWriter fileWriterB = new FileWriter("tmp\\b.txt");
        fileWriterB.write("a");
        fileWriterB.write("a");
        fileWriterB.write("c");
        fileWriterB.close();
        System.out.println(Files.mismatch(Path.of("tmp\\a.txt"),Path.of("tmp\\b.txt")));
    }

    public static void main(String[] args) throws IOException {
        testFilesMismatch();
    }
}
