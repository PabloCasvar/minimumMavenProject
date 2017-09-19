package hello;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Pablo on 18/9/2017.
 */
public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello(){
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
