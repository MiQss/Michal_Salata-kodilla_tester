import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void testFindChemistUsers(){
        //when
        List<String> chemistGroupUsernames= UsersManager.filterChemistGroupUsernames();
        //then
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gale Boetticher");
        assertEquals(users,chemistGroupUsernames);
    }
    @Test
    public void testFindUsersOver45(){
        //when
        List<String> usersOver45= UsersManager.filterOver45Age();
        //then
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gus Firing");
        users.add("Mike Ehrmantraut");
        assertEquals(users,usersOver45);
    }
    @Test
    public void testFindUsersOver45WithMoreThan1Post(){
        //when
        List<String> usersOver45WithMoreThan1Post= UsersManager.filterOver45AgeAndMoreThan1Post();
        //then
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        assertEquals(users,usersOver45WithMoreThan1Post);
    }
}

