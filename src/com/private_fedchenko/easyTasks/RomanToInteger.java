package com.private_fedchenko.easyTasks;

//Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

//worst case complexity for twoSumSolution ideally:              ___?
//worst case complexity for twoSumSolution method IN MY ALGO:    O(n)

import com.private_fedchenko.ElapsedTime;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static ElapsedTime elapsedTime = new ElapsedTime();

    public static void main(String[] args) {
        String stringWithNumerals = "CXLV";//145
        String stringWithNumerals2 = "CDXLIX";//449
        String stringWithNumerals3 = "MMDCCXII";//2712
        int result;
        elapsedTime.saveStartTime();
        result = romanToInt(stringWithNumerals3);
        elapsedTime.saveEndTime();
        elapsedTime.measureElapsedTime();
        System.out.println("Converted numeral: " + result);
        System.out.println("Calculation took " + elapsedTime.getElapsedTime() + " ms");
    }

    public static int romanToInt(String number) {
        Map<Character, Integer> mappedVals = new HashMap<Character, Integer>();
        mappedVals.put('I', 1);
        mappedVals.put('V', 5);
        mappedVals.put('X', 10);
        mappedVals.put('L', 50);
        mappedVals.put('C', 100);
        mappedVals.put('D', 500);
        mappedVals.put('M', 1000);

        int resultNumber = 0;
        int prevNumber = 0;
        int currNumber = 0;
        char numberArr[] = number.toCharArray();
        for (int i = 0; i < numberArr.length; i++) {
            currNumber = mappedVals.get(numberArr[i]);
            if (prevNumber < currNumber) {
                resultNumber += currNumber;
                resultNumber -= 2 * prevNumber;
            } else {
                resultNumber += currNumber;
            }
            prevNumber = currNumber;
        }
        return resultNumber;
    }
}
