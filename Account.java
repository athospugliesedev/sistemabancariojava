import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);
    
    private int accountNumber;
    private String agency;
    private float balance;

    public Account(int accountNumber, String agency, float balance) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void extract() {

        System.out.println(getBalance());

    }

    public void deposit() {

        System.out.println("Informe o valor a ser depositado: ");
        float value = sc.nextFloat();
        setBalance(getBalance() + value);
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + getBalance());

    }

    public void withdraw() {

        System.out.println("Informe o valor a ser sacado: ");
        float value = sc.nextFloat();

        if (value <= getBalance()) {
            setBalance(getBalance() - value);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + getBalance());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    sc.close();

    }

}
