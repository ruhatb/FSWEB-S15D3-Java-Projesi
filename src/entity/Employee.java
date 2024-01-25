package entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstname;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(int id, String firstname, String lastName) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return id == employee.id && Objects.equals(firstname, employee.firstname) && Objects.equals(lastName, employee.lastName);
    }

    public int hashCode() {
        return Objects.hash( id);
    }
}
