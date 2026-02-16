package commonground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InputTest {

    @Test
    void isNonBlank_rejectsNullEmptySpaces() {
        assertFalse(Input.isNonBlank(null));
        assertFalse(Input.isNonBlank(""));
        assertFalse(Input.isNonBlank("   "));
        assertTrue(Input.isNonBlank("x"));
    }

    @Test
    void isValidAvatar_acceptsOnlyPngOrJpg_andNoDelimiters() {
        assertTrue(Input.isValidAvatar("a.png"));
        assertTrue(Input.isValidAvatar("b.jpg"));
        assertFalse(Input.isValidAvatar("c.jpeg"));
        assertFalse(Input.isValidAvatar("a.png,evil"));
        assertFalse(Input.isValidAvatar(""));
    }
}
