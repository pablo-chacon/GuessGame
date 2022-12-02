package trivia;

import java.util.HashMap;

public class Subject extends TriviaBoard {

    private HashMap<String, String> subject = new HashMap<>();


    public HashMap<String, String> History() {
        subject.put("Which queen of England had 11 fingers", "Anne Boleyn");
        subject.put("Which racist organisation was formed in Tennessee in 1865", "Ku Klux Klan");
        subject.put("Which revolt took place in 1381", "The Peasants revolt");
        subject.put("Which revolutionary type of firearm was invented by Richard Gatling in 1862", "the machine gun");
        subject.put(
                "Which royal palace was given by Charles II to his mistress, the Duchess of Cleveland who sold it for building materials",
                "nonsuch palace");
        subject.put("Which Saudi Arabian king was assassinated in 1975", "King Faisal");
        subject.put("Which scandal hit sportsman was described by wife Monica in 1998 as kind of shy?", "Mike Tyson");
        subject.put("Which Scottish King was known as Toom Tabard", "john balliol");
        subject.put("Which ship did Charles Darwin captain", "HMS Beagle");
        subject.put("Which ship sent the first SOS", "Titanic");

        return subject;
    }

    public HashMap<String, String> Geography() {
        subject.put("Where in London is the American Embassy", "Grosvenor Square");
        subject.put("Where in London were the Frost Fairs held until 1831", "on the thames");
        subject.put("Where in Scotland is there a replica of the Colosseum of Rome known as McCaigs Tower", "oban");
        subject.put("where in the heck is britain's royal observatory", "greenwich");
        subject.put("where in the heck is dam square", "amsterdam");
        subject.put("Where in the US is Mount Mckinley", "denali national park and preserve");
        subject.put("Where is Angel Falls", "Venezuela");
        subject.put("Where is area 51 generally said to be", "Groom Lake");
        subject.put("Where is Arnhem Land", "Australia");
        subject.put("Where is Beacon Street", "boston");
        subject.put("Where is Britains tallest nave", "Westminster Abbey");

        return subject;
    }

    public HashMap<String, String> Games() {
        subject.put("how many properties are there on a monopoly board", "28");
        subject.put("How many sets are there in a full-length men's championship tennis match", "Five");
        subject.put("How many squares are there on a chessboard", "64");
        subject.put("how many tiles does a player play to score a bingo in scrabble", "7");
        subject.put("How much does Park Place cost in Monopoly (in US Dollars)", "450");
        subject.put("how much is the luxury tax (in dollars) in monopoly", "75");
        subject.put("If you 'peg out' what game are you playing", "cribbage");
        subject.put("If, during a game of chess, you made a move 'en passant', which piece would you be moving", "a pawn");
        subject.put("In a game of horseshoes, how many feet apart must the stakes be", "forty");
        subject.put("In Chess, the obligation to move even when it must be disadvantageous", "zug zwang");
        subject.put("In poker five cards of the same suit is called a(n) ____", "flush");

        return subject;
    }

    public HashMap<String, String> Astronomy() {
        subject.put("Mars is ____ kilometres in diameter", "6,790");
        subject.put("Mars is ____ miles in diameter", "4,219");
        subject.put("Mars is ____ million kilometres from the Sun", "228");
        subject.put("Mars is sometimes called the ____ planet", "red");
        subject.put("The spiral galaxy nearest ours is the ____ galaxy", "Andromeda");
        subject.put("Mythology: What gods are the planets of our solar system named after", "roman gods");
        subject.put("Name the largest planet in the solar system", "jupiter");
        subject.put("Name the second-largest planet in the solar system", "saturn");
        subject.put("Our galaxy is commonly known as the ____", "Milky Way");
        subject.put("The North Star is also known as ____", "polaris");
        subject.put( "The planet closest to the sun is ____", "mercury");

        return subject;
    }

    public HashMap<String, String> Computers() {
        subject.put("Hal, the computer in 2001: A Space Odyssey, got its name how?", "The letters before I B and M");
        subject.put("How many bits are in a nibble", "4");
        subject.put("How much cache did the Coppermine CPU have", "256k");
        subject.put("In computer lingo what is a MUD?", "Multi User Computer Game");
        subject.put("In what year was the Intel Pentium processor introduced", "1993");
        subject.put("a LAN is called a____", "local area network");
        subject.put(
                "After breaking into physicist Tsutomu Shimomura's computer on Christmas in 1994, what legendary hacker was taken down?",
                "Kevin Mitnick");
        subject.put("demo means____", "demonstration");
        subject.put("In what field of study are the terms CPU, PC, and VDU used?", "Computer Science");
        subject.put("From what source did William Henry Gates III amass his fortune?", "Computer software");
        subject.put(
                "Digital Equipment Corporation sued what computer chip manufacturer claiming it stole the technology to develop the Pentium Pro?",
                "Intel orporation");

        return subject;
    }



}

