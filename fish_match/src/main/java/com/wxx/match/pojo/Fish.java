package com.wxx.match.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description //fish 实体类
 * @Date 2019/3/10 15:10
 * @Author wxx
 **/

@Entity
@Table(name = "fish_base")
public class Fish {

      @Id
      private String id;

    private String fishname;
    private String fish_disease;
    private Double spring;
    private Double summer;
    private Double fall;
    private Double winter;
    private Double tenless;
    private Double tenand15;
    private Double fifteen;
    private Double twentyand25;
    private int sample_count;

    public String getFishname() {
        return fishname;
    }

    public void setFishname(String fishname) {
        this.fishname = fishname;
    }

    public String getFish_disease() {
        return fish_disease;
    }

    public void setFish_disease(String fish_disease) {
        this.fish_disease = fish_disease;
    }

    public Double getSpring() {
        return spring;
    }

    public void setSpring(Double spring) {
        this.spring = spring;
    }

    public Double getSummer() {
        return summer;
    }

    public void setSummer(Double summer) {
        this.summer = summer;
    }

    public Double getFall() {
        return fall;
    }

    public void setFall(Double fall) {
        this.fall = fall;
    }

    public Double getWinter() {
        return winter;
    }

    public void setWinter(Double winter) {
        this.winter = winter;
    }

    public Double getTenless() {
        return tenless;
    }

    public void setTenless(Double tenless) {
        this.tenless = tenless;
    }

    public Double getTenand15() {
        return tenand15;
    }

    public void setTenand15(Double tenand15) {
        this.tenand15 = tenand15;
    }

    public Double getFifteen() {
        return fifteen;
    }

    public void setFifteen(Double fifteen) {
        this.fifteen = fifteen;
    }

    public Double getTwentyand25() {
        return twentyand25;
    }

    public void setTwentyand25(Double twentyand25) {
        this.twentyand25 = twentyand25;
    }

    public int getSample_count() {
        return sample_count;
    }

    public void setSample_count(int sample_count) {
        this.sample_count = sample_count;
    }
}