package terminal;

import java.io.File;

public class RunTerminal {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("ls");
        pb.inheritIO();
        pb.directory(new File("/home/dima/Documents"));
        try {
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
