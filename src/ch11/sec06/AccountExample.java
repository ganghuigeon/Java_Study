package ch11.sec06;


public class AccountExample {

    public static void main(String[] args) throws InsufficientException {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance() + "원");

        account.withdraw(30000);

    }
}
