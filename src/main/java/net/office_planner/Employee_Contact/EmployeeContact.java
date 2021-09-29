package net.office_planner.Employee_Contact;

import javax.persistence.*;

@Entity
@Table
public class EmployeeContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phone_number;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(nullable = false, unique = true, length = 45)
    private int employee_id;
    @Column(nullable = false, length = 45)
    private String employee_box_no;
    @Column(nullable = false, length = 45)
    private String town;
    @Column(nullable = false, length = 45)
    private String country;

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_box_no() {
        return employee_box_no;
    }

    public void setEmployee_box_no(String employee_box_no) {
        this.employee_box_no = employee_box_no;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "EmployeeContact{" +
                "phone_number=" + phone_number +
                ", email='" + email + '\'' +
                ", employee_id=" + employee_id +
                ", employee_box_no='" + employee_box_no + '\'' +
                ", town='" + town + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
