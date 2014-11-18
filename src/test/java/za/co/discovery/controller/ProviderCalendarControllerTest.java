package za.co.discovery.controller;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by steven on 2014/11/18.
 */
public class ProviderCalendarControllerTest {

    private ProviderCalendarController providerCalendarController;

    @Before
    public void setUp(){
        providerCalendarController = new ProviderCalendarController();
    }
    @Test
    public void itShouldReturnGreeting(){
        String message = providerCalendarController.sayHelloWorld();
        assertThat(message, is("Hello World"));
    }
}
