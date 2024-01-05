package com.Studentdatabase.Studentdatabase.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



     @Column(name = "id")
     private Long id;
    @Column(name = "Serial_No")

    private Integer sno;

    @Column(name = "contact_number")
    private Long contact_number;
     @Column(name = "department")
     private String department;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    public Student(){


    }


    public Student(Integer sno,String firstName, String lastName, String email,String department,Long contact_number) {
        super();
        this.sno=sno;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.contact_number=contact_number;

    }
    public Integer getSno() {
        return sno;
    }
    public void setSno(Integer sno) {
        this.sno = sno;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getContact_number() {
        return contact_number;
    }
    public void setContact_number(Long contact_number) {
        this.contact_number = contact_number;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

