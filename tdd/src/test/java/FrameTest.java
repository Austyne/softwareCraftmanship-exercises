import be.ucll.craft.Frame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FrameTest {

    Frame frame;
    @BeforeEach
    public void beforeEach() {
        frame = new Frame();
    }

    @Test
    public void canCreateFrame() {
        assertNotNull(frame);
    }

}
