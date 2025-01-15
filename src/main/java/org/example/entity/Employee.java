package org.example.entity;

import javax.persistence.*;

@Entity
@Table (name = "employees")

public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "pa_surname")
    private String paSurname;
    @Column (name = "ma_surname")
    private String maSurname;
    private String email;
    private Float salary;

    public Employee() {

    }

    public Employee(int id, String firstName, String pa_surname, String ma_surname, String email, Float salary) {
        this.id = id;
        this.firstName = firstName;
        this.paSurname = pa_surname;
        this.maSurname = ma_surname;
        this.email = email;
        this.salary = salary;
    }

    public String getPaSurname() {
        return paSurname;
    }

    public void setPaSurname(String paSurname) {
        this.paSurname = paSurname;
    }

    public String getMaSurname() {
        return maSurname;
    }

    public void setMaSurname(String maSurname) {
        this.maSurname = maSurname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", pa_surname='" + paSurname + '\'' +
                ", ma_surname='" + maSurname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
