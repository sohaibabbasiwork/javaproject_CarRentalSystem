/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem.clases;

/**
 *
 * @author Hp
 */
public class Employee {
    
    private String name;
    private String age;
    private String gender;
    
    private String job;
    private String salary;
    private String phone;
    private String cnic;
    private String email;  
    
    public Employee(String name,String age,String gender,String job,String salary,String phone,String cnic,String email)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.job=job;
        this.salary=salary;
        this.phone=phone;
        this.cnic = cnic;
        this.email=email;
        
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getage() {
        return age;
    }

    public void setRoom_no(String age) {
        this.age = age;
    }

    public String getgender() {
        return gender;
    }

    public void setBed_number(String gender) {
        this.gender = gender;
    }

    public String getjob() {
        return job;
    }

    public void setjob(String job) {
        this.job = job;
    }

    public String getsalary() {
        return salary;
    }

    public void setsalary(String salary) {
        this.salary = salary;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getcnic() {
        return cnic;
    }

    public void setcnic(String cnic) {
        this.cnic = cnic;
    }


    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    
    
}
