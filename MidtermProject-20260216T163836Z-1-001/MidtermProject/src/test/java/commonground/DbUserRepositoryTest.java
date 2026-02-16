package commonground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DbUserRepositoryTest {

    @Test
    void constructor_createsInstance() {
        DbUserRepository db = new DbUserRepository("jdbc:test", "u", "p");
        assertNotNull(db);
    }
}
