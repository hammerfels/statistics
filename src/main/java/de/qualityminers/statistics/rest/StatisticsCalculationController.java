package de.qualityminers.statistics.rest;

import de.qualityminers.statistics.domain.ResultDTO;
import de.qualityminers.statistics.domain.Input;
import de.qualityminers.statistics.service.StatisticsCalculationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Tags({ @Tag(name = "Statistics Calculation") })
@RestController
@RequestMapping("/api/statistics")
public class StatisticsCalculationController {
    
    private StatisticsCalculationService resultService = new StatisticsCalculationService();

    @PostMapping(value = "/calculateAverage", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
    @Operation(summary = "Calculates the average of an array of doubles.")
    public ResultDTO caluclateAverage(@RequestBody Input input) {
        return new ResultDTO(resultService.calculateAverage(input));
    }

    @PostMapping(value = "/calculateMedian", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO calculateMedian(@RequestBody Input input) {
        return new ResultDTO(resultService.calculateMedian(input));
    }
    
    @PostMapping(value = "/calculateVariance", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO calculateVariance(@RequestBody Input input) {
        return new ResultDTO(resultService.calculateVariance(input));
    }

    @PostMapping(value = "/calculateStandardDeviation", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO calculateStandardDeviation(@RequestBody Input input) {
        return new ResultDTO(resultService.calculateStandardDeviation(input));
    }
    
    @PostMapping(value = "/calculateCP", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO calculateCP(@RequestBody Input input) {
        return new ResultDTO(resultService.calculateCP(input));
    }

     @PostMapping(value = "/calculateCPK", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO calculateCPK(@RequestBody Input input) {
        return new ResultDTO(resultService.calculateCPK(input));
    }
    
    
}
