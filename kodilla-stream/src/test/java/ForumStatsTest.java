import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @Test
    public void testAverageNumberOFPostForUsersOver40() {
        List<User> users = UsersRepository.getUsersList();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        double test = ForumStats.getAverageNumberOFPostForUsersOver40(users);
        assertEquals(2.25, test);
    }
    @Test
    public void testAverageNumberOFPostForUsersUnder40() {
        List<User> users = UsersRepository.getUsersList();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        double test = ForumStats.getAverageNumberOFPostForUsersUnder40(users);
        assertEquals(2382.0, test);
    }
}
