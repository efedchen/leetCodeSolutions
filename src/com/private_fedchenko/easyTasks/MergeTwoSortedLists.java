package com.private_fedchenko.easyTasks;

//Merge two sorted linked lists and return it as a new list.
//The new list should be made by splicing together the nodes of the first two lists.
//        Example:
//
//     Input: 1->2->4, 1->3->4
//     Output: 1->1->2->3->4->4

//worst case complexity for twoSumSolution ideally:              ...?
//worst case complexity for twoSumSolution method IN MY ALGO:    O(n)


import com.private_fedchenko.ElapsedTime;

import java.util.LinkedList;

public class MergeTwoSortedLists {

    public static ElapsedTime elapsedTime = new ElapsedTime();
    public static LinkedList<Integer> list1 = new LinkedList<>();
    public static LinkedList<Integer> list2 = new LinkedList<>();

    public static void main(String[] args) {
        LinkedList<Integer> resultList;
        fillUpList1();
        fillUpList2();

        elapsedTime.saveStartTime();

        resultList = mergeTwoLists();

        elapsedTime.saveEndTime();
        elapsedTime.measureElapsedTime();

        System.out.println("Result list: " + resultList);
        System.out.println("Elapsed Time: " + elapsedTime.getElapsedTime());
    }

    public static LinkedList<Integer> mergeTwoLists() {
        LinkedList<Integer> resultList = new LinkedList<>();
        int list1Pointer = 0;
        int list2Pointer = 0;

        while (list1Pointer < list1.size() || list2Pointer < list2.size()) {
            int list1Elem = list1Pointer == list1.size() ? list2.get(list2Pointer) + 1 : list1.get(list1Pointer);
            int list2Elem = list2Pointer == list2.size() ? list1.get(list1Pointer) + 1 : list2.get(list2Pointer);


            if (list1Elem < list2Elem) {
                resultList.add(list1Elem);
                list1Pointer++;
            } else if (list1Elem > list2Elem) {
                resultList.add(list2Elem);
                list2Pointer++;
            } else {
                resultList.add(list1Elem);
                resultList.add(list2Elem);
                list1Pointer++;
                list2Pointer++;
            }
        }


        return resultList;
    }

    public static void fillUpList1() {
        list1.add(1);
        list1.add(4);
        list1.add(7);
        list1.add(9);
        list1.add(12);
        list1.add(16);
    }

    public static void fillUpList2() {
        list2.add(3);
        list2.add(4);
        list2.add(8);
        list2.add(9);
        list2.add(15);
    }
}
