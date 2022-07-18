package equals;

public class EqualsCheck {
    public static void main(String[] args){
        First first = new First();
        First anotherFirst = new First();
        boolean check =  first.equals(anotherFirst);
        System.out.println(check);

        System.out.println(first.hashCode());
        System.out.println(anotherFirst.hashCode());

        Second second = new Second();
        Second anotherSecond = new Second();
        System.out.println(second.equals(anotherSecond));

        System.out.println(second.hashCode());
        System.out.println(anotherSecond.hashCode());

        Third third1 = new Third();
        third1.id = 1;
        third1.name = "name";
        Third third2 = new Third();
        third2.id = 1;
        third2.name = "name";
        Third third3 = new Third();
        third3.id = 2;
        third3.name = "hi";
        System.out.println( "third1.equals(third2) = " +  third1.equals(third2)); // true
        System.out.println( "third2.equals(third3) = " + third2.equals(third3)); // false

    }
}
