package trivia;

import java.util.*;

public class TriviaBoard implements Trivia<Subject> {

    List<String> triviaQueries = new ArrayList<>(20);
    Subject subject = new Subject();

    public TriviaBoard() {
        triviaQueries.add(subject.Astronomy().get(2));
        triviaQueries.add(subject.History().get(5));
        triviaQueries.add(subject.Computers().get(9));
        triviaQueries.add(subject.Games().get(7));
        triviaQueries.add(subject.Geography().get(3));
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