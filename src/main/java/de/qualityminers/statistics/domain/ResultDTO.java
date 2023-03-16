package de.qualityminers.statistics.domain;

import java.io.Serializable;

public class ResultDTO implements Serializable{

    private double result;

    public ResultDTO() {}
    
    public ResultDTO(Result result) {
        this.result = result.getResult();
    }
    
    public double getResult() {
        return result;
    }
    
    public void setResult(double result) {
        this.result = result;
    } 
         
    @Override
    public String toString() {
        return "Result [result=" + result + "]";
    }
}
