package com.wxx.match.Dao;

import com.wxx.match.pojo.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Description //TODO
 * @Date 2019/3/10 15:26
 * @Author wxx
 **/
public interface  FishDao  extends JpaRepository<Fish,String>, JpaSpecificationExecutor<Fish> {

        public List<Fish> findAllByFishname(String fishname);
        public List<Fish> findAllByFishnameLike(String fishname);

        //public List<Fish> findbyfishname(String fishname);
//            public List<String> findAllByFishname(String fishname);
//            public List<String> findFirstByFish_disease(String fishdisease);
}
