package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class UserDB implements DataAccessObject<User> {

    private List<User> users = new ArrayList<>();

    public UserDB() {
        users.add(new User("Bot", "0", "0"));

    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }


    @Override
    public void newPlayer(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setLevel(Objects.requireNonNull(
                params[1], "You didn't reach a new level."));
        user.setScore(Objects.requireNonNull(
                params[2], "No new $ for you."));

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
