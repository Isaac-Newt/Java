package question_5_story;

import java.io.IOException;
import java.nio.CharBuffer;

public class Student implements Story, Readable {
    // Implement abstract methods from interfaces
    public void Tell() {
        System.out.println("Student tells a story");
    }

    public void Read() {
        System.out.println("Student reads a story");
    }

    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        // Why did my IDE require that I include this? What even is it?
        return 0;
    }
}
