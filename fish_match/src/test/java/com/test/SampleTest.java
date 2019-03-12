package com.test;

import com.wxx.match.Dao.DiseaseDao;
import com.wxx.match.Dao.FishDao;
import com.wxx.match.MatchApplication;
import com.wxx.match.pojo.Disease;
import com.wxx.match.pojo.Fish;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

/**
 * @Description //TODO
 * @Date 2019/3/10 16:16
 * @Author wxx
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MatchApplication.class)
@WebAppConfiguration
public class SampleTest {
    @Autowired
    private FishDao fishDao;

    @Autowired
    private DiseaseDao diseaseDao;
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @Test
    public void test2()
    {

        //Optional<Fish> fish = fishDao.findById("2");
        /*String property = System.getProperty("file.encoding");
        System.out.println(property);*/
       // String fishname=new String("真鲷".getBytes("ISO-8859-1"),"UTF-8");
        List<Fish> list = fishDao.findAllByFishname(" ");
        //List<Fish> list=fishDao.findAllByFishnameLike("%"+"大"+"%");
        //fishDao.findAllByFishname()
        for (Fish fish1:list)
        {
            System.out.println(fish1.getFish_disease());
        }
        //List<String> list = fishDao.findn();
        //Disease disease = diseaseDao.findByFishdisease("肝胰腺坏死病".toString());
        //System.out.println(disease.getFishname());
       //System.out.println(diseaseDao.findById(1).get().getFishdisease());
    }
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }


}
