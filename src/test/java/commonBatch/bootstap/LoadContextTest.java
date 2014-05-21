package commonBatch.bootstap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author przodownik
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-batch.xml" })
@ActiveProfiles(profiles="dev")
public class LoadContextTest {

    @Test
    public void shouldLoadContext(){
        
    }
}
