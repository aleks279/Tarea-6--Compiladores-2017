package tarea6;

import java.io.*;

public class PromptReader {
	BufferedReader in;
    PrintStream out;
    public PromptReader(InputStream in, PrintStream out) {
        this.in = new BufferedReader(new InputStreamReader(in));
        this.out = out;
    }

    public String getLine() throws IOException {
        String st = in.readLine();
        return st;
    }

    public String promptLine() throws IOException {
        drawPrompt();
        return getLine();
    }

    private void drawPrompt() {
        out.print(">> ");
    }
}
