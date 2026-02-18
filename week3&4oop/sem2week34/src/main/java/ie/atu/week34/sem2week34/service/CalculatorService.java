package ie.atu.week34.sem2week34.service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }
}
