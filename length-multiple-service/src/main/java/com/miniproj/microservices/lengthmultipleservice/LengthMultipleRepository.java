package com.miniproj.microservices.lengthmultipleservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LengthMultipleRepository extends JpaRepository<LengthMultiple,Long> {

	LengthMultiple findByFromAndTo(String from, String to);
}
