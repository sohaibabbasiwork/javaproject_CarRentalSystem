/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem.clases;

/**
 *
 * @author Hp
 */
public class Customer {
    
    private String name;
    private String gender; 
    private String country;
    private String pay;
    private String phone;
    private String cnic;
    private String email;
    private String date; 
    private String return_date;  

    private String id_type;  
    
    private Vehicle vehicleno;

   Vehicle vehicle=new Vehicle();
    
    
    public Customer(String name,Vehicle vehicleno,String gender,String country,String pay,String phone,String cnic,String email,String date ,String type ,String return_date)
    {
        this.name=name;
        this.vehicleno=vehicleno;
        this.gender=gender;
        this.country=country;
        this.pay=pay;
        this.phone=phone;
        this.cnic = cnic;
        this.email=email;
        this.date=date;
        this.id_type=type;
        this.return_date=return_date;
        
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Vehicle getvehicleno() {
        return vehicleno;
    }

    public void setVehicleno(Vehicle vno) {
        this.vehicleno = vno;
    }

    public String getgender() {
        return gender;
    }

    public void setBed_number(String gender) {
        this.gender = gender;
    }

    public String setcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public String getpay() {
        return pay;
    }

    public void setpay(String pay) {
        this.pay = pay;
    }

    public String getphone() {
        return phone;
    }

    public void setphaone(String phone) {
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
    
       public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }
    
       public String getid_type() {
        return id_type;
    }

    public void srtid_type(String type) {
        this.id_type = type;
    }

       public String getreturn_date() {
        return return_date;
    }

    public void setreturn_date(String date) {
        this.date = date;
    }    
    
    
}
