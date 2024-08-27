package entities;

public class Address {
    private String email;
    private String phone;

    public Address(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Para dúvidas favor entrar em contato: " + email;
    }
}
