public class Card {
    private String cardType;
    private String cardNumber;
    private String userName;
    private double amountOfMoney;

    public Card(String cardType, String cardNumber, String userName, double amountOfMoney) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.amountOfMoney = amountOfMoney;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
