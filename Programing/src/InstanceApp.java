import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {
    public static void main(String[] args) throws IOException {
        
        PrintWriter P1 = new PrintWriter ("result1.txt");
        P1.write("Hello 1");
        P1.close();

        PrintWriter P2 = new PrintWriter ("result2.txt");
        P2.write("Hello 2");
        P2.close();

        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        
    }
    
}
