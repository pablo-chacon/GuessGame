package trivia;

import java.util.*;

public class TriviaBoard implements Trivia<Subject> {

    List<String> triviaQueries = new ArrayList<>(20);
    List<String> triviaResponses = new ArrayList<>(20);

    public TriviaBoard() {
        triviaQueries.add(new Subject().Astronomy().get(2));
        triviaQueries.add(new Subject().History().get(5));
    }

    @Override
    public Optional<String> get(long id) {
        return Optional.ofNullable(triviaQueries.get((int) id));
    }

    @Override
    public List<String> getAll() {
        return triviaQueries;
    }

}