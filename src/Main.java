import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] a = {"Visa", "MasterCard", "БЕЛКАРТ"};
        ATM atm = new ATM(50000, true, a);
        User user = new User("Игорь", "Visa");
        Card card = new Card("Visa", "123456", user.getName(), 6000);
        System.out.println("Добрый день! Это банкомат.");
            atm.cardTypeCheck(user.getCard());

            for (int i = 0;;i++) {
                atm.menu();
                switch (atm.operationType()) {
                    case 0:
                        System.out.println("Выход из банкомата");
                        return;
                    case 1:
                        System.out.println("На вашем счету " + card.getAmountOfMoney() + " рублей");
                        break;
                    case 2:
                            double takeOffSum = atm.withDrawMoney();
                            if (takeOffSum > card.getAmountOfMoney()){
                                try {
                                    throw new LackMoneyException();
                                } catch (LackMoneyException e) {
                                    System.out.println("Недостаточно средств");
                                }
                            }  else
                                card.setAmountOfMoney(card.getAmountOfMoney() - takeOffSum);
                            break;
                    default:
                        System.out.println("Ввели некорректные данные. Попробуйте ещё раз:");
                        break;
                }
            }
    }
}
