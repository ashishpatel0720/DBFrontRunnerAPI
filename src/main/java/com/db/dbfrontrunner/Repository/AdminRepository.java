package com.db.dbfrontrunner.Repository;

import com.db.dbfrontrunner.Tables.Admin;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AdminRepository extends CrudRepository<Admin, String> {

}