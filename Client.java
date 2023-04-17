import java.util.ArrayList;

public class Client {

    private int cpf;
    private String name;
    private ArrayList<Account> accounts;
    private Address address;
    private ArrayList<Phone> phones;

    public Client(int cpf, String name, Address address) {
        this.cpf = cpf;
        this.name = name;
        this.accounts = new ArrayList<>();
        this.address = address;
        this.phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public int getCpf() {
        return cpf;
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public ArrayList<Phone> getPhones() {
        return phones;
    }
    

}
