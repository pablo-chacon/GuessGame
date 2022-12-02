package user;

import java.util.List;
import java.util.Optional;

//DAO interface.
public interface DataAccessObject<U> {

    Optional<User> get(long id);
    List<U> getAll();
    List<U> findByName();

    void newUser(User user);

    void update(User user, String[] params);

    void delete(User user);
}
