package com.customerinfo.customerinfo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerinfo")
public class customerinfo {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customer_id;
    private String c_name;
    private String c_age;
    private String c_location;
    private String c_gender;
    private String c_phoneno;
    public customerinfo() {
    }
    
    public customerinfo(String customer_id, String c_name, String c_age, String c_location, String c_gender,
            String c_phoneno) {
        this.customer_id = customer_id;
        this.c_name = c_name;
        this.c_age = c_age;
        this.c_location = c_location;
        this.c_gender = c_gender;
        this.c_phoneno = c_phoneno;
    }
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public String getC_name() {
        return c_name;
    }
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    public String getC_age() {
        return c_age;
    }
    public void setC_age(String c_age) {
        this.c_age = c_age;
    }
    public String getC_location() {
        return c_location;
    }
    public void setC_location(String c_location) {
        this.c_location = c_location;
    }
    public String getC_gender() {
        return c_gender;
    }
    public void setC_gender(String c_gender) {
        this.c_gender = c_gender;
    }
    public String getC_phoneno() {
        return c_phoneno;
    }
    public void setC_phoneno(String c_phoneno) {
        this.c_phoneno = c_phoneno;
    }
    
}