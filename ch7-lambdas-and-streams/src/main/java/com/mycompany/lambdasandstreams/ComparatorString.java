package com.mycompany.lambdasandstreams;

import java.util.Comparator;

public class ComparatorString implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

}