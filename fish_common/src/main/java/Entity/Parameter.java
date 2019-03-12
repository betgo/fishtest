package Entity;

import java.util.List;

/**
 *封装参数
 * {
 *  "fishname":鱼名
 *  “season“:季节
 *  “temperature”:[
 *   20,
 *   15]
 *  “symptom":[
 *       “症状”，“症状”，“症状”
 *  ]
 * }
 *
 */
public class Parameter {
    private String fishname;//鱼名
    private String season;//季节
    private List<Integer> temperature;//温度区间
    private List<String> symptom;//症状

    public String getFishname() {
        return fishname;
    }

    public void setFishname(String fishname) {
        this.fishname = fishname;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<Integer> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<Integer> temperature) {
        this.temperature = temperature;
    }

    public List<String> getSymptom() {
        return symptom;
    }

    public void setSymptom(List<String> symptom) {
        this.symptom = symptom;
    }
}
