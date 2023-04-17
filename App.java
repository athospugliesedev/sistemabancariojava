import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPF do cliente: ");
        int cpf = sc.nextInt();
    
        System.out.println("Digite o nome do cliente: ");
        String name = sc.next();
    
        System.out.println("Digite o CEP do endereço: ");
        int cep = sc.nextInt();
    
        System.out.println("Digite o logradouro do endereço: ");
        String log = sc.next();
    
        System.out.println("Digite o número do endereço: ");
        int number = sc.nextInt();
    
        Address address = new Address(cep, log, number);
    
        System.out.println("Digite o DDD do telefone: ");
        int ddd = sc.nextInt();
    
        System.out.println("Digite o número do telefone: ");
        int phoneNumber = sc.nextInt();
    
        Phone phone = new Phone(ddd, phoneNumber);
    
        Client client = new Client(cpf, name, address);
        client.addPhone(phone);
    
        System.out.println("Digite o número da conta: ");
        int accountNumber = sc.nextInt();
    
        System.out.println("Digite a agência: ");
        String agency = sc.next();
    
        System.out.println("Digite o saldo inicial da conta: ");
        float balance = sc.nextFloat();
    
        Account account = new Account(accountNumber, agency, balance);
        client.addAccount(account);
    
        System.out.println("CPF: " + client.getCpf());
        System.out.println("Nome: " + client.getName());
        System.out.println("Endereço: " + client.getAddress().getCep() + " " + client.getAddress().getLogradouro() + ", " + client.getAddress().getNumber());
        System.out.println("Telefone: (" + client.getPhones().get(0).getDdd() + ") " + client.getPhones().get(0).getPhoneNumber());
        System.out.println("Conta: " + client.getAccounts().get(0).getAccountNumber() + " - " + client.getAccounts().get(0).getAgency() + " - " + client.getAccounts().get(0).getBalance());
    
        System.out.println("Digite 0 para sair do banco: ");
        int exit = sc.nextInt();
        if (exit == 0) {
            sc.close();
            System.exit(0);
        }
    }
    
}
