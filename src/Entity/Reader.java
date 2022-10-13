package Entity;

public class Reader {
    String firstname;
    String lastname;
    String phone;

    public Reader() {
    }

    public String firstname() {
        return firstname;
    }

    public Reader setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String lastname() {
        return lastname;
    }

    public Reader setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String phone() {
        return phone;
    }

    public Reader setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "Reader{"
                + "firstname='" + firstname + '\''
                + ", lastname='" + lastname + '\''
                + ", phone='" + phone + '\''
                + '}';
    }
}
