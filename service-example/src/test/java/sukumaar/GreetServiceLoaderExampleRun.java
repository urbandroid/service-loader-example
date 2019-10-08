package sukumaar;

import org.junit.Test;
import sukumaar.client.ServiceLoaderExample;

/**
 * Unit test for simple ServiceLoaderExample.
 */
public class GreetServiceLoaderExampleRun {
    /**
     * TODO: This tests still passes even though expected results not returns.
     * for example "No1 is actually greeting" makes it pass.
     */
    @Test
    public void asgardThorGreeting() {
        String[] args = {"asgardThor", "Sukumaar"};
        ServiceLoaderExample.main(args);
    }

    @Test
    public void earthThorGreeting() {
        String[] args = {"earthThor", "Sukumaar"};
        ServiceLoaderExample.main(args);
    }
}
