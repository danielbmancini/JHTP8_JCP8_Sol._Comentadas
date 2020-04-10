package ex8_14;

import java.util.Arrays;

public class IntegerSet {
    private boolean[] set;
    private int number = 0;

    public IntegerSet() {
        set = new boolean[101];
        Arrays.fill(set, false);
    }

    public void insertElement(int integer) {
        if (!set[integer])
            set[integer] = true;
        else
            System.out.println("Number already in the set.");
    }

    public void deleteElement(int integer) {
        if (set[integer])
            set[integer] = false;
        else
            System.out.println("Number is not in the set.");
    }

    public IntegerSet union(IntegerSet set_b) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            unionSet.set[i] = set[i] || set_b.set[i];
        }
        return unionSet;
    }

    public IntegerSet intersection(IntegerSet set_b) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            intersectionSet.set[i] = set[i] && set_b.set[i];
        }
        return intersectionSet;
    }

    public boolean isEqualTo(IntegerSet set_b) {
        boolean equality = true;
        for (int i = 0; i < set.length; i++)
            if (set[i] != set_b.set[i]) {
                equality = false;
                break;
            }
        return equality;
    }

    public String to_String() {
        StringBuilder setString = new StringBuilder();
        for (int i = 0; i < set.length; i++)
            if (set[i])
                setString.append(i).append(" ");
        return String.valueOf(setString);
    }
}
