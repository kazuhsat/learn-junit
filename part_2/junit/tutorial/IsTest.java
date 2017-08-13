package junit.tutorial;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsTest extends BaseMatcher {
    @Override
    public boolean matches(Object actual) {
        if (actual != "test") {
            return false;
        }

        return true;
    }

    @Override
    public void describeTo(Description desc) {
        desc.appendValue("test");
    }

    public static Matcher<String> test() {
        return new IsTest();
    }
}
