package com.customerinfo.customerinfo;

import java.util.List;

public interface customerinfoservice{
    public String createcustomerinfo(customerinfo Info);
    public String updatecustomerinfo(customerinfo Info);
    public String deletecustomerinfo(String id);
    public customerinfo getcustomerinfo(String id);
    //public List<customerInfo> getAllcustomerInfo();
    //public String getcustomerInfo(String customerId);
    public List<customerinfo> getAllcustomerinfo();
    //public String deletecustomerinfo(String customer_id);
    

}