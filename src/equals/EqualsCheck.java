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

    }
}
