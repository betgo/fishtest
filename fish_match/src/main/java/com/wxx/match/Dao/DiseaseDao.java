package com.wxx.match.Dao;

import com.wxx.match.pojo.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseDao extends JpaRepository<Disease,Integer> {
   // public Disease findByFishdisease(String fishdisease);
   // public Disease findByFishdisease(String fishdisease);
}
