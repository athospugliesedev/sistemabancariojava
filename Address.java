public class Address {

    private int cep;
    private String logradouro;
    private int number;

    public Address(int cep, String logradouro, int number) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.number = number;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
