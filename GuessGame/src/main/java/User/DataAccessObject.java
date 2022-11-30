package User;

import java.util.List;
import java.util.Optional;

//DAO interface.
public interface DataAccessObject<U> {

    Optional<User> get(long id);
    List<U> getAll();
    List<U> findByName();
    boolean insertPlayer(User user);
    boolean updatePlayer(User user);
    boolean deleteEmployee(User user);

    void newPlayer(User user);

    void update(User user, String[] params);

    void delete(User user);
}
