import ex8_14.IntegerSet;

/*
    Exercise 8.14 main class
 */
public class IntegerSet_Run {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.insertElement(3);
        set2.insertElement(3);
        set1.insertElement(1);
        set2.insertElement(2);
        set1.insertElement(4);
        set2.insertElement(4);
        System.out.println("Set 1: " + set1.to_String());
        System.out.println("Set 2: " + set2.to_String());
        System.out.println("Union: " + set1.union(set2).to_String());
        System.out.println("Intersection: " + set1.intersection(set2).to_String());
        set1.deleteElement(3);
        System.out.println("Is set1 equal to set2 after set1.deleteElement(3)? : " + set1.isEqualTo(set2));
        set1.insertElement(3);
        System.out.println("Is set1 equal to set2 after set1.insertElement(3)? : " + set1.isEqualTo(set2));
        set2.deleteElement(2);
        System.out.println("Is set1 equal to set2 after set2.deleteElement(2)? : " + set1.isEqualTo(set2));
        set2.insertElement(1);
        System.out.println("Is set1 equal to set2 after set2.insertElement(1)? : " + set1.isEqualTo(set2));
    }
}