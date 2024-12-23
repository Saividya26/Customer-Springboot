package com.customerinfo.customerinfo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class customerinfoserimple implements customerinfoservice {
    private  customerrepo repo;

    public customerinfoserimple(customerrepo repo) {
        this.repo = repo;
    }

    @Override
    public List<customerinfo> getAllcustomerinfo() {
       return repo.findAll();
    }

    @Override
    public String createcustomerinfo(customerinfo Info) {
        repo.save(Info);
        return "created";
    }

    @Override
    public String updatecustomerinfo(customerinfo Info) {
       repo.save(Info);
       return "updated";
    }

    @Override
    public String deletecustomerinfo(String id) {
       repo.deleteById(id);
       return "Deleted";
    }

    @Override
    public customerinfo getcustomerinfo(String id) {
        return repo.findById(id).get();
    }
    
}


















/*package com.customerinfo.customerinfo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerinfoserimple implements customerinfoservice {
    private final customerrepo repo;

    @Autowired
    public customerinfosereimple(customerrepo repo) {
        this.repo = repo;
    }

    @Override
    public List<customerinfo> getAllcustomerinfo() {
        return repo.findAll();
    }

    @Override
    public long createcustomerinfo(customerinfo info) {
        customerinfo savedInfo = repo.save(info);
        return savedInfo.getId();  // Return the ID of the created entity
    }

    @Override
    public long updatecustomerinfo(customerinfo info) {
        customerinfo updatedInfo = repo.save(info);
        return updatedInfo.getId();  // Return the ID of the updated entity
    }

    @Override
    public boolean deletecustomerinfo(long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;  // Indicate that the entity was deleted
        }
        return false;  // Indicate that the entity was not found
    }

    @Override
    public customerinfo getcustomerinfo(long customerId) {
        Optional<customerinfo> customerInfo = repo.findById(customerId);
        return customerInfo.orElse(null);  // Return the entity or null if not found
    }
}*/
