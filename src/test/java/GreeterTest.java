import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void test() throws Exception {
        Assertions.assertThat(greeter.greet("Bruno")).isEqualTo("Hello Bruno");
    }
}