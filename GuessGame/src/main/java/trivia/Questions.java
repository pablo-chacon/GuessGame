package trivia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Questions {

    public HashMap<String, String> Questions() {
        HashMap<String, String> trivia = new HashMap<>();
        trivia.put("Where in London is the American Embassy", "Grosvenor Square");
        trivia.put("Where in London were the Frost Fairs held until 1831", "on the thames");
        trivia.put("Where in Scotland is there a replica of the Colosseum of Rome known as McCaigs Tower", "oban");
        trivia.put("where in the heck is britain's royal observatory", "greenwich");
        trivia.put("where in the heck is dam square", "amsterdam");
        trivia.put("Where in the US is Mount Mckinley", "denali national park and preserve");
        trivia.put("Where is Angel Falls", "Venezuela");
        trivia.put("Where is area 51 generally said to be", "Groom Lake");
        trivia.put("Where is Arnhem Land", "Australia");
        trivia.put("Where is Beacon Street", "boston");
        trivia.put("Where is Britains tallest nave", "Westminster Abbey");
        trivia.put("how many properties are there on a monopoly board", "28");
        trivia.put("How many sets are there in a full-length men's championship tennis match", "Five");
        trivia.put("How many squares are there on a chessboard", "64");
        trivia.put("how many tiles does a player play to score a bingo in scrabble", "7");
        trivia.put("How much does Park Place cost in Monopoly (in US Dollars)", "450");
        trivia.put("how much is the luxury tax (in dollars) in monopoly", "75");
        trivia.put("If you 'peg out' what game are you playing", "cribbage");
        trivia.put("If, during a game of chess, you made a move 'en passant', which piece would you be moving", "a pawn");
        trivia.put("In a game of horseshoes, how many feet apart must the stakes be", "forty");
        trivia.put("In Chess, the obligation to move even when it must be disadvantageous", "zug zwang");

        return trivia;
    }

    public List<String> mocks() {
        List<String> mock = new ArrayList<>(2);
        Random r = new Random(mocks().size());
        mock.add("mock1");
        mock.add("mock2");
        mock.add("mock3");
        return mock;
    }

    public String query() {
        return String.valueOf(Questions().keySet());
    }

    public String answer() {
        return String.valueOf(Questions().values());
    }
}
