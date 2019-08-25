package com.private_fedchenko;

import java.util.ArrayList;
import java.util.Collections;

public class wefsaf {
    public static void main(String[] args) {
        int a = 82944; //factors 1,2,3,4,6,12
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a%i == 0){
                res.add(i);
                if(a / i != i){res.add(a/i);}
            }
        }
        Collections.sort(res);
        System.out.println();
        System.out.println("______________________");
        for(Integer i : res){
            System.out.println(i);
        }
    }
}
