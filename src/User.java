public class User {
    private String name;
    private String card;

    public User(String name, String card) {
        this.name = name;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getCard() {
        return card;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
