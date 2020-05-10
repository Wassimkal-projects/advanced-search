package com.wkprojects.search.repository;

import com.wkprojects.search.domain.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LaptopRepository extends JpaRepository<Laptop, Long>, JpaSpecificationExecutor<Laptop> {
}
