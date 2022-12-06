package trivia;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Trivia  {

    static Query query = new Query();

    public static void loadTrivia() throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(
                "/home/paraply/IdeaProjects/GuessGame/GuessGame/src/main/resources/com/guessgameschool/guessgame/trivia.csv"));
        while ((line = br.readLine()) != null) {
            // seprator ",".
            String[] cols = line.split(",");
            query.setSubject(cols[0]);
            query.setQuery(cols[1]);
            query.setCorrectAnswer(cols[2]);
        }
    }



}
