package de.qualityminers.statistics.domain;

public class Input {

    private double[] measuredValues;
    private double lowerTolerance;
    private double upperTolerance;

    public Input() {
    }

    public double[] getMeasuredValues() {
        return measuredValues;
    }

    public void setMeasuredValues(double[] measuredValues) {
        this.measuredValues = measuredValues;
    }

    public double getLowerTolerance() {
        return lowerTolerance;
    }

    public void setLowerTolerance(double lowerTolerance) {
        this.lowerTolerance = lowerTolerance;
    }

    public double getUpperTolerance() {
        return upperTolerance;
    }

    public void setUpperTolerance(double upperTolerance) {
        this.upperTolerance = upperTolerance;
    }

}
