package com.example.swts.Repository;

import com.example.swts.Model.ServicesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends JpaRepository<ServicesModel, Long> {

}
