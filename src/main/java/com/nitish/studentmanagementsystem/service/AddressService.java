package com.nitish.studentmanagementsystem.service;

import com.nitish.studentmanagementsystem.model.Address;
import com.nitish.studentmanagementsystem.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddRepo;
    public void addAddress(Address address){
        iAddRepo.save(address);
    }
}
