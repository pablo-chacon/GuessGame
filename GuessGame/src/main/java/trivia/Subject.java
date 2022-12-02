package trivia;

import java.util.HashMap;

public class Subject extends TriviaBoard {

    private HashMap<String, String> query = new HashMap<>();


    public HashMap<String, String> History() {
        query.put("Which queen of England had 11 fingers", "Anne Boleyn");
        query.put("Which racist organisation was formed in Tennessee in 1865", "Ku Klux Klan");
        query.put("Which revolt took place in 1381", "The Peasants revolt");
        query.put("Which revolutionary type of firearm was invented by Richard Gatling in 1862", "the machine gun");
        query.put(
                "Which royal palace was given by Charles II to his mistress, the Duchess of Cleveland who sold it for building materials",
                "nonsuch palace");
        query.put("Which Saudi Arabian king was assassinated in 1975", "King Faisal");
        query.put("Which scandal hit sportsman was described by wife Monica in 1998 as kind of shy?", "Mike Tyson");
        query.put("Which Scottish King was known as Toom Tabard", "john balliol");
        query.put("Which ship did Charles Darwin captain", "HMS Beagle");
        query.put("Which ship sent the first SOS", "Titanic");

        return query;
    }

    public HashMap<String, String> Geography() {
        query.put("Where in London is the American Embassy", "Grosvenor Square");
        query.put("Where in London were the Frost Fairs held until 1831", "on the thames");
        query.put("Where in Scotland is there a replica of the Colosseum of Rome known as McCaigs Tower", "oban");
        query.put("where in the heck is britain's royal observatory", "greenwich");
        query.put("where in the heck is dam square", "amsterdam");
        query.put("Where in the US is Mount Mckinley", "denali national park and preserve");
        query.put("Where is Angel Falls", "Venezuela");
        query.put("Where is area 51 generally said to be", "Groom Lake");
        query.put("Where is Arnhem Land", "Australia");
        query.put("Where is Beacon Street", "boston");
        query.put("Where is Britains tallest nave", "Westminster Abbey");

        return query;
    }

    public HashMap<String, String> Games() {
        query.put("how many properties are there on a monopoly board", "28");
        query.put("How many sets are there in a full-length men's championship tennis match", "Five");
        query.put("How many squares are there on a chessboard", "64");
        query.put("how many tiles does a player play to score a bingo in scrabble", "7");
        query.put("How much does Park Place cost in Monopoly (in US Dollars)", "450");
        query.put("how much is the luxury tax (in dollars) in monopoly", "75");
        query.put("If you 'peg out' what game are you playing", "cribbage");
        query.put("If, during a game of chess, you made a move 'en passant', which piece would you be moving", "a pawn");
        query.put("In a game of horseshoes, how many feet apart must the stakes be", "forty");
        query.put("In Chess, the obligation to move even when it must be disadvantageous", "zug zwang");
        query.put("In poker five cards of the same suit is called a(n) ____", "flush");

        return query;
    }

    public HashMap<String, String> Astronomy() {
        query.put("Mars is ____ kilometres in diameter", "6,790");
        query.put("Mars is ____ miles in diameter", "4,219");
        query.put("Mars is ____ million kilometres from the Sun", "228");
        query.put("Mars is sometimes called the ____ planet", "red");
        query.put("The spiral galaxy nearest ours is the ____ galaxy", "Andromeda");
        query.put("Mythology: What gods are the planets of our solar system named after", "roman gods");
        query.put("Name the largest planet in the solar system", "jupiter");
        query.put("Name the second-largest planet in the solar system", "saturn");
        query.put("Our galaxy is commonly known as the ____", "Milky Way");
        query.put("The North Star is also known as ____", "polaris");
        query.put( "The planet closest to the sun is ____", "mercury");

        return query;
    }

    public HashMap<String, String> Computers() {
        query.put("Hal, the computer in 2001: A Space Odyssey, got its name how?", "The letters before I B and M");
        query.put("How many bits are in a nibble", "4");
        query.put("How much cache did the Coppermine CPU have", "256k");
        query.put("In computer lingo what is a MUD?", "Multi User Computer Game");
        query.put("In what year was the Intel Pentium processor introduced", "1993");
        query.put("a LAN is called a____", "local area network");
        query.put(
                "After breaking into physicist Tsutomu Shimomura's computer on Christmas in 1994, what legendary hacker was taken down?",
                "Kevin Mitnick");
        query.put("demo means____", "demonstration");
        query.put("In what field of study are the terms CPU, PC, and VDU used?", "Computer Science");
        query.put("From what source did William Henry Gates III amass his fortune?", "Computer software");
        query.put(
                "Digital Equipment Corporation sued what computer chip manufacturer claiming it stole the technology to develop the Pentium Pro?",
                "Intel orporation");

        return query;
    }



}

