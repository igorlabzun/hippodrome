import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;



class MainTest {

    @Test
    @Timeout(value = 22,unit = TimeUnit.SECONDS)
    public void main_CheckMethodExecution() throws Exception {
        Main.main(new String[]{});
    }
}