package commonground;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UserProfileTest {

    @Test
    void constructor_whenInterestsNull_createsEmptyInterests() {
        UserProfile u = new UserProfile(1, "A", "a", "x.png", null);
        assertEquals("", u.getInterestsText());
    }

    @Test
    void getInterestsText_sortsAndJoins() {
        Set<String> interests = new LinkedHashSet<>();
        interests.add("music");
        interests.add("coding");
        interests.add("gym");

        UserProfile u = new UserProfile(1, "A", "a", "x.png", interests);
        assertEquals("coding, gym, music", u.getInterestsText());
    }
}
