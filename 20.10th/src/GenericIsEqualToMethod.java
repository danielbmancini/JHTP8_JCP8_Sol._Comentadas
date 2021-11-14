/*
    exercise 20.7
 */
public class GenericIsEqualToMethod {
    public static <T> boolean isEqualTo(T obj1,T obj2)
    {
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Integer obj3 = 1;
        Integer obj4 = 2;
        String obj5 = "a";

        System.out.printf("%nIs %s equal to %s? %s",obj1,obj1,isEqualTo(obj1,obj1));
        System.out.printf("%nIs %s equal to %s? %s",obj1,obj2,isEqualTo(obj1,obj2));
        System.out.printf("%nIs %s equal to %s? %s",obj3,obj3,isEqualTo(obj3,obj3));
        System.out.printf("%nIs %s equal to %s? %s",obj5,obj4,isEqualTo(obj5,obj4));

    }
}
