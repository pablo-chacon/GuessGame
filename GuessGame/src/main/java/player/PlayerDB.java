package player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class PlayerDB implements DataAccessObject<Player>{

    private List<Player> players = new ArrayList<>();

    public PlayerDB() {
        players.add(new Player("Bot", "0", "0"));

    }

    @Override
    public Optional<Player> get(long id) {
        return Optional.ofNullable(players.get((int) id));
    }

    @Override
    public List<Player> getAll() {
        return players;
    }


    @Override
    public void newPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void update(Player player, String[] params) {
        player.setLevel(Objects.requireNonNull(
                params[1], "You didn't reach a new level."));
        player.setScore(Objects.requireNonNull(
                params[2], "No new $ for you."));

        players.add(player);
    }

    @Override
    public void delete(Player player) {
        players.remove(player);
    }
}
