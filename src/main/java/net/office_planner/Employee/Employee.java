package net.office_planner.Employee;

import net.office_planner.User.User;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @Column(name = "employee_id", nullable = false, length = 45, unique = true)
    private Long employee_id;
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")

    private User user;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Employee() {
    }

    public User getUser() {
        return user;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", user=" + user +
                '}';
    }
}
