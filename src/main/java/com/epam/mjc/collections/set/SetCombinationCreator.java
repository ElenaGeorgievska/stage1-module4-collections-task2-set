package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        //temporary set for 1,2, and 3rd set
        Set<String> firstTempSet = new LinkedHashSet<>(firstSet);
        Set<String> secondTempSet = new LinkedHashSet<>(secondSet);
        Set<String> thirdTempSet = new LinkedHashSet<>(thirdSet);

        //intersection between the 1 and 2 temporary sets and between 2 and 3 temporary sets
        firstTempSet.retainAll(thirdTempSet);
        secondTempSet.retainAll(thirdTempSet);

        //remove all different elements between 1st set  and the set of intersection of 1st and 3rd;
        // and between 3rd and intersection between 1st and 3rd
        Set<String> intersectionOfFirstAndThird = new LinkedHashSet<>(firstTempSet);
        firstSet.removeAll(intersectionOfFirstAndThird);
        thirdSet.removeAll(intersectionOfFirstAndThird);

        //remove all different elements between 2nd set  and the set of intersection of 2nd and 3rd;
        // and between 3rd and intersection between 2nd and 3rd
        Set<String> intersectionOfSecondAndThird = new LinkedHashSet<>(secondTempSet);
        secondSet.removeAll(intersectionOfSecondAndThird);
        thirdSet.removeAll(intersectionOfSecondAndThird);

        //intersection between the 1st and second set;
        // and adding all of the elements from 3rd set which are not present in the intersection between 1st and 2nd set
        firstSet.retainAll(secondSet);
        firstSet.addAll(thirdSet);

        return firstSet;
    }
}
