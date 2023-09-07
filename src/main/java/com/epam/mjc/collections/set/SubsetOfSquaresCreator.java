package com.epam.mjc.collections.set;

import java.util.*;

import static java.lang.Math.pow;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> resultSet = new TreeSet<>();
        NavigableSet<Integer> subSet = new TreeSet<>();

        Iterator<Integer> i = sourceList.iterator();
        while(i.hasNext()){
            int b = i.next();
            int squares = (int) pow(b,2);
            resultSet.add(squares);
        }

        for (int e : resultSet){
            if (e>= lowerBound && e<= upperBound){
                subSet.add(e);
            }
        }

        return subSet;
    }
}
