package player;

import java.util.List;
import java.util.Optional;

//DAO interface.
public interface DataAccessObject<P> {

    Optional<Player> get(long id);
    List<P> getAll();
    List<P> findByName();
    boolean insertPlayer(Player player);
    boolean updatePlayer(Player player);
    boolean deleteEmployee(Player player);

    void newPlayer(Player player);

    void update(Player player, String[] params);

    void delete(Player player);
}
