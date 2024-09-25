package com.autech.hackerrank.threemonthinterview;

import com.autech.hackerrank.threemonthinterview.week1.PlusMinus;
import com.autech.hackerrank.threemonthinterview.week1.WeekOneTest_FindMedian;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
public class Runner {

    @Autowired
    PlusMinus plusMinus;

    @Autowired
    WeekOneTest_FindMedian weekOneTestFindMedian;

//    @PostConstruct
    public void runPlusMinus(){
        List<Integer> arr = new ArrayList<>(List.of(-4, 3, -9, 0, 4, 1));
        plusMinus.plusMinus(arr);
    }

    @PostConstruct
    public void runWeekOneTest_FindMedian(){
        List<Integer> arr = new ArrayList<>(List.of(0,1,2,4,6,5,3));
        System.out.println(weekOneTestFindMedian.findMedian(arr));
    }




    public static void main(String[] args) {
        LocalDate dateStarted = LocalDate.of(2024, 8, 6);
        LocalDate todayDate = LocalDate.now();
        log.info("90 days Interview prep - Today : {}, Days Spent : {}", todayDate, ChronoUnit.DAYS.between(todayDate, dateStarted));
        log.info("Add more exciting info in the logs, lets contribute and make this better consistently!!");
        SpringApplication.run(Runner.class);
    }
}
