package ex8_14;

import java.util.Arrays;

class ex8_14_IntegerSet {
    private boolean[] set;
    private int number = 0;

    ex8_14_IntegerSet() {
        set = new boolean[101];
        Arrays.fill(set, false);
    }

    void insertElement(int integer) {
        if (!set[integer])
            set[integer] = true;
        else
            System.out.println("Number already in the set.");
    }

    void deleteElement(int integer) {
        if (set[integer])
            set[integer] = false;
        else
            System.out.println("Number is not in the set.");
    }

    ex8_14_IntegerSet union(ex8_14_IntegerSet set_b) {
        ex8_14_IntegerSet unionSet = new ex8_14_IntegerSet();
        for (int i = 0; i < set.length; i++) {
            unionSet.set[i] = set[i] || set_b.set[i];
        }
        return unionSet;
    }

    ex8_14_IntegerSet intersection(ex8_14_IntegerSet set_b) {
        ex8_14_IntegerSet intersectionSet = new ex8_14_IntegerSet();
        for (int i = 0; i < set.length; i++) {
            intersectionSet.set[i] = set[i] && set_b.set[i];
        }
        return intersectionSet;
    }

    boolean isEqualTo(ex8_14_IntegerSet set_b) {
        boolean equality = true;
        for (int i = 0; i < set.length; i++)
            if (set[i] != set_b.set[i]) {
                equality = false;
                break;
            }
        return equality;
    }

    String to_String() {
        StringBuilder setString = new StringBuilder();
        for (int i = 0; i < set.length; i++)
            if (set[i])
                setString.append(i).append(" ");
        return String.valueOf(setString);
    }
}
