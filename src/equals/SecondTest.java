package equals;

import org.junit.jupiter.api.Assertions;

class SecondTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        Second second = new Second();
        second.setId(1);
        second.setName("name");
        Second another = new Second();
        another.setId(1);
        another.setName("name");
        Assertions.assertEquals(second,another);
    }

}