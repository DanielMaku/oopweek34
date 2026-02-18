package ie.atu.week34.sem2week34.service;

import org.springframework.stereotype.Service;

@Service

public class StatsService {
    public int average(int a, int b)
    {
        return (a+b) / 2;
    }

    public int highest(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}

