package com.example.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Khadim NDAO
 * Date: 15/04/2022
 * Time: 11:17
 * Project Name : docker-jekins
 */
public class MyMath {
    int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
