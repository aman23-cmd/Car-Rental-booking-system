import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testUserRegistration() {
        User user = new User("Aman", "password");
        UserService service = new UserService();
        assertTrue(service.registerUser(user));
    }
}
