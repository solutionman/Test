package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.setId(1L);
        // field name is inherited from BaseClass
        someClass.setNickName("nickName");

        someClass.setName("name");
        someClass.setFamilyName("familyName");

        System.out.println(someClass.getId());
        System.out.println(someClass.getBaseId());
    }
}
