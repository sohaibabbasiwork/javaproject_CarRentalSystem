/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem.clases;

/**
 *
 * @author Hp
 */
public class Vehicle {
 
    private String vehicleno;
    private String availablity;
    private String status;
    
    private String fule;
    private int price;

    
    public Vehicle(String vehicleno,String avail,String status,String fule,int price)
    {
        this.vehicleno=vehicleno;
        this.availablity=avail;
        this.status=status;
        this.fule=fule;
        this.price=price;

        
    }
 public Vehicle()
    {
        this.vehicleno="";
        this.availablity="";
        this.status="";
        this.fule="";
        this.price=0;

        
    }
    public String getvehicleno() {
        return vehicleno;
    }

    public void setname(String no) {
        this.vehicleno = no;
    }

    public String getavailablity() {
        return availablity;
    }

    public void setRoom_no(String avail) {
        this.availablity = avail;
    }

    public String getstatus() {
        return status;
    }

    public void setBed_number(String status) {
        this.status = status;
    }

    public String getfule() {
        return fule;
    }

    public void setfule(String fule) {
        this.fule = fule;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }
}
