package de.qualityminers.statistics.service;

import de.qualityminers.statistics.domain.Input;
import de.qualityminers.statistics.domain.Result;

public class StatisticsCalculationService {

    public Result calculateSum(int left, int right) {
        return new Result(left + right);
    }

    public Result calculateAverage(Input input) {
        double sum = 0.0;
        for (double value : input.getMeasuredValues()) {
            sum += value;
        }
        return new Result(sum / input.getMeasuredValues().length);
    }

    public Result calculateMedian(Input input) {
        if (input.getMeasuredValues().length % 2 == 0) {
            double measuredValue[] = input.getMeasuredValues();
            double first = measuredValue[(int) (measuredValue.length / 2) - 1];
            double second = measuredValue[(int) (measuredValue.length / 2)];
            double median = (first + second) / 2;
            return new Result(median);
        } else {
            return new Result(input.getMeasuredValues()[(int) Math.floor(input.getMeasuredValues().length / 2)]);
        }
    }

    public Result calculateVariance(Input input) {
        double average = calculateAverage(input).getResult();
        double calcvalue = 0.0;
        for (double value : input.getMeasuredValues()) {
            calcvalue += Math.pow(value - average, 2);
        }
        return new Result(calcvalue / input.getMeasuredValues().length);
    }

    public Result calculateStandardDeviation(Input input) {
        double var = calculateVariance(input).getResult();
        return new Result(Math.sqrt(var));
    }

    public Result calculateCP(Input input) {
        double std = calculateStandardDeviation(input).getResult();
        return new Result((input.getUpperTolerance() - input.getLowerTolerance()) / 6 * std);
    }

    public Result calculateCPK(Input input) {
        double std = calculateStandardDeviation(input).getResult();
        double avg = calculateAverage(input).getResult();
        double lower = (avg - input.getLowerTolerance()) / 3 * std;
        double upper = (input.getUpperTolerance()) / 3 * std;
        return new Result(lower < upper ? lower : upper);
    }

}
