import java.util.Scanner;

public class ATM {
    public double totalMoney;
    public boolean doesItWork ;
    public String [] cardType;

    public ATM(double totalMoney, boolean doesItWork, String[] cardType) {
        this.totalMoney = totalMoney;
        this.doesItWork = doesItWork;
        this.cardType = cardType;
    }

    public void cardTypeCheck(String a) {
        boolean flag = false;
        for (int i = 0; i < cardType.length; i++) {
            if (cardType[i].equals(a)) {
                flag = true;
                break;
            } else flag = false;
        }
        if (flag == false) {
            try {
                throw new WrongCardTypeException();
            } catch (WrongCardTypeException e) {
                System.out.println("Данный тип карт не поддерживается");
                System.exit(0);
            }
        }
    }

    public static void menu(){
        System.out.println("Для просмотра текущего счёта нажмите 1");
        System.out.println("Для снятие денег нажмите 2");
        System.out.println("Для завершения работы нажмите 0");
    }

    public int operationType (){
        int num;
        Scanner scanner = new Scanner(System.in);
        try {
            String enterValue = scanner.nextLine();
            num = Integer.parseInt(enterValue);
        } catch (NumberFormatException e) {
            System.out.println("Ввели некорректные данные. Попробуйте еще раз:");
            num = operationType();
        }
       return num;
    }

    public double withDrawMoney(){
        System.out.println("Введите сумму, которую хотите снять:");
        double sum;
        Scanner scanner = new Scanner(System.in);
        try {
            String enterValue = scanner.nextLine();
            sum = Double.parseDouble(enterValue);
            if (sum <= 0) {
                try {
                    throw new NegativeNumberException();
                } catch (NegativeNumberException e) {
                    System.out.println("Ввели некорректные данные. Попробуйте еще раз:");
                    sum = operationType();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввели некорректные данные. Попробуйте еще раз:");
            sum = operationType();
        }

        return sum;
    }
    }




