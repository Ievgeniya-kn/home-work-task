package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

//        TODO implements result

        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(list.size() - i-1));
        }
        return list2;
    }

    public String getLongestString(List<String> list) {

        int length = 0;
        String result = "";

        for (String s : list) {
            if (length <= s.length())
                result = s;
            length = s.length();

        }
//        TODO implements result


        return result;
    }

    public List<String> changeIndex(List<String> list) {

        String temp = list.get(1);
        list.set(1,list.get(3));
        list.set(3,temp);

//        TODO implements result

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

        List<String> newList = new ArrayList<>();


        for (String s:list
             ) { if (newList.contains(s)==false)
                 newList.add(s);

        }
//        TODO implements result

        return newList;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result
        Collections.sort(list);

        return list;
    }
}
