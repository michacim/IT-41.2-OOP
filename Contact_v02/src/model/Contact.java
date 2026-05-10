package model;

import java.util.Objects;

public class Contact {

    private String name;
    private String number;
    private String email;
    private int id;
    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public Contact(int id,String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(number, contact.number) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {

        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(number);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + id;
        return result;
    }
}
