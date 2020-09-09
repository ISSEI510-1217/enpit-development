package 1;
import static org.junit.Assert.*;
import org.junit.Test;

public class ApplesTest {
    @Test 
    public void AppleCountTest() throws Exception {
        ApplesCount AC = new ApplesCount();
        int expected = 3;
        assertThat(AC.applenum(),is(expected));
    }
}
