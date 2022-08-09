package training.jenkins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void greetertst(){
        Greeter greeter = new Greeter();
        assertEquals("hi", greeter.greeter());
    }

    @Test
    public void personalGreetertst(){
        Greeter greeter = new Greeter();
        String name = "josé";
        assertEquals("hi "+name, greeter.personalGreeter(name));
    }
}
