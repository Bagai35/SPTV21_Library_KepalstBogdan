package Entity;

public class Author {
    String firstname;
    String lastname;
    int birthday;

    public Author() {
    }

    public String firstname() {
        return firstname;
    }

    public Author setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String lastname() {
        return lastname;
    }

    public Author setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public int birthday() {
        return birthday;
    }

    public Author setBirthday(int birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public String toString() {
        return "Author{"
                + "firstname='" + firstname + '\''
                + ", lastname='" + lastname + '\''
                + ", birthday=" + birthday
                + '}';
    }
}
