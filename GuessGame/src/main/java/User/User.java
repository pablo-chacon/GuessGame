// Player POJO.
package User;



public class User {

    private String name;
    private String score;
    private String level;


    public User(String name, String score, String level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
