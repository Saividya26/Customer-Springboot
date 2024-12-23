
package com.customerinfo.customerinfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/customerinfo")
public class customerinfocontroller {
    customerinfoservice service;

    public customerinfocontroller(customerinfoservice service) {
        this.service = service;
    }
    
    @GetMapping("{id}")
    public customerinfo getcustomerinfo(@PathVariable String id) {
        return service.getcustomerinfo(id);
    }
    
    @PostMapping
    public String createcustomerinfo(@RequestBody customerinfo Info){
        service.createcustomerinfo(Info);
        return "created successfully";
    }

    @PutMapping
    public String updatecustomerinfo(@RequestBody customerinfo Info) {
        service.updatecustomerinfo(Info);
        return "updated successfully";
    }

    @DeleteMapping("{id}")
        public String deletcustomerinfo(@PathVariable("id")String id){
                service.deletecustomerinfo(id);
                return "deleted successfully";
        }
    
    
    @GetMapping
    public List<customerinfo> getAllcustomerinfo(){
        return service.getAllcustomerinfo();
    }

    }
