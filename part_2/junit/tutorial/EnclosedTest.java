package junit.tutorial;

@RunWith(Enclosed.class)
public class EnclosedTest {
    public static class TestA {
        @Test
        public void test_a() {
            assertEquals(true, true);
        }
    }

    public static class TestB {
        @Test
        public void test_b() {
            assertEquals(true, true);
        }
    }
}
