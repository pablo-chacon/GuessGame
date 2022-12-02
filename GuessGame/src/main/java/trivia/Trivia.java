package trivia;

import java.util.List;
import java.util.Optional;

public interface Trivia<Subject> {

    Optional<String> get(long id);

    List<String> getAll();

}