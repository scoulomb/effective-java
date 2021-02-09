package com.mycompany.lambdasandstreams;

import java.util.*;

import static java.util.Comparator.comparingInt;


/**
 * Hello world!
 *
 */
public class App 
{
    static void item_42_a(){
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println((new StringBuilder()).append("== RUNNING: ").append(methodName));
        // we could use: https://stackoverflow.com/questions/442747/getting-the-name-of-the-currently-executing-method
        // for hierarchy

        List<String> listToSort = Arrays.asList("Docker", "Kubernetes", "podman", "cri-o", "contenaird", "OCI");

        List<String> listToSort_1 = new ArrayList<>(listToSort);
        Collections.sort(listToSort_1, new ComparatorString());

        List<String> listToSort_2 =  new ArrayList<>(listToSort);
        Collections.sort(listToSort_2, new Comparator<String>(){
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        List<String> listToSort_3 =  new ArrayList<>(listToSort);

        Collections.sort(listToSort_3, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        List<String> listToSort_4 =  new ArrayList<>(listToSort);
        Collections.sort(listToSort_4, comparingInt(String::length));

        System.out.println("Initial list");
        System.out.println(listToSort);
        System.out.println("Print with full java class");
        System.out.println(listToSort_1);
        System.out.println("Print with anonymous java class");
        System.out.println(listToSort_2);
        System.out.println("Print with lambda");
        System.out.println(listToSort_3);
        System.out.println("Print with comparator constructor method");
        System.out.println(listToSort_4);

    }

    static void item_42_b(){
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println((new StringBuilder()).append("== RUNNING: ").append(methodName));

        System.out.println("Enum with lambda");
        String[] input = {"3", "3"};
        Operation.main(input);
        OperationWithLambda.main(input);
    }


    public static void main( String[] args )
    {
        item_42_a();
        item_42_b();
    }
}
