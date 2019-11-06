package app;

public class App {
    public static BankSystem bank = new BankSystem();

    public static void main(String[] args) throws Exception {

        bank.getBankName();
        bank.displayMenu();
    }
}
