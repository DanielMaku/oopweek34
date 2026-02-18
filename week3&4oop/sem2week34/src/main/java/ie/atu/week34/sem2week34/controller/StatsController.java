package ie.atu.week34.sem2week34.controller;


import ie.atu.week34.sem2week34.service.StatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {
    private final StatsService statsService;

    public StatsController(StatsService statsService)
    {
        this.statsService = statsService;
    }

    @GetMapping("/average")
    public ResponseEntity<Integer> average (@RequestParam int a, @RequestParam int b) {
        int result = statsService.average(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/highest")
    public ResponseEntity<Integer> highest (@RequestParam int a, @RequestParam int b) {
        int result = statsService.highest(a, b);
        return ResponseEntity.ok(result);
    }

}