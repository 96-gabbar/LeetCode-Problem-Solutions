package com.autech.hackerrank.threemonthinterview.week1;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Component
public class PlusMinus {

    public void plusMinus(List<Integer> arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;
        for(int x: arr){
            if(x>0){
                positiveCount++;
            }else if(x<0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        double positiveRatio = positiveCount/arr.size();
        double negativeRatio = negativeCount/arr.size();
        double zeroRatio = zeroCount/arr.size();
        System.out.println(BigDecimal.valueOf(positiveRatio).setScale(6, RoundingMode.HALF_UP).doubleValue());
        System.out.println(BigDecimal.valueOf(negativeRatio).setScale(6, RoundingMode.HALF_UP).doubleValue());
        System.out.println(BigDecimal.valueOf(zeroRatio).setScale(6, RoundingMode.HALF_UP).doubleValue());
    }
}
