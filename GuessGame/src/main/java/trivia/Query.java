package trivia;

public class Query {

    public String subject;
    private String query;
    private String correctAnswer;
    private String mock1, mock2, mock3;

    public Query() {
    }

    public Query(String subject, String query, String correctAnswer, String mock1, String mock2, String mock3) {
        this.subject = subject;
        this.query = query;
        this.correctAnswer = correctAnswer;
        this.mock1 = mock1;
        this.mock2 = mock2;
        this.mock3 = mock3;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getMock1() {
        return mock1;
    }

    public void setMock1(String mock1) {
        this.mock1 = mock1;
    }

    public String getMock2() {
        return mock2;
    }

    public void setMock2(String mock2) {
        this.mock2 = mock2;
    }

    public String getMock3() {
        return mock3;
    }

    public void setMock3(String mock3) {
        this.mock3 = mock3;
    }

    public String toString() {
        return "Subject : " + getSubject() + " Query : " + getQuery() + " Answer : " + getCorrectAnswer() +
                "\nMock 1 : " + getMock1() + " Mock 2 : " + getMock2() + " Mock 3 : " + getMock3();
    }
}
