package trivia;


public class Question {

    private String subject, query, answer;
    public String mock1, mock2, mock3;

    public Question(String subject, String query, String answer, String mock1, String mock2, String mock3) {
        this.subject = subject;
        this.query = query;
        this.answer = answer;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getMock1() {
        return mock1;
    }

    public String getMock2() {
        return mock2;
    }

    public String getMock3() {
        return mock3;
    }
}
