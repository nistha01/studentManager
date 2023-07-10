package com.nitish.studentmanagementsystem.repo;

import com.nitish.studentmanagementsystem.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
}
