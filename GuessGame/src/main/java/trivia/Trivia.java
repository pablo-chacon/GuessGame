package trivia;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trivia  {

    static Query query = new Query();
    static List<String> queries = new ArrayList<>(2);

    public static void loadTrivia() throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(
                "GuessGame/src/main/resources/com/guessgameschool/guessgame/trivia.csv"));
        while ((line = br.readLine()) != null) {
            // seprator ",".
            String[] cols = line.split(",");
            query.setSubject(cols[0]);
            query.setQuery(cols[1]);
            query.setCorrectAnswer(cols[2]);
            query.setMock1("Mock");
            query.setMock2("Mock");
            query.setMock3("Mock");
            queries.add(query.toString());
        }
    }

}
