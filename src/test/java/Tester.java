import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    @BeforeAll
    public static void test1() {
        System.out.println("before all tests");
    }
    @AfterEach
    public void test2() {
        System.out.println("after EACH tests");
    }
    @BeforeEach
    public void test3() {
        System.out.println("before EACH tests");
    }
    @Test
    public void test() {
        assertEquals(2, Main.add(1, 1));
    }
    @Test
    public void test4() {
        assertEquals(1, Main.add(1, 0));
    }
    @Test
    public void test5() {
        assertEquals(1, Main.add(0, 1));
    }
    @Test
    public void test6() {
        assertEquals(0, Main.add(0, 0));
    }
    @Test
    public void test7() {
        assertEquals(2, Main.add(1, 1));
    }

}
