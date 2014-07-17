package in_action.ch7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import in_action.ch5.SpitterService;
import in_action.ch5.Spittle;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA. User: Alexandr Date: 04.11.13 Time: 23:24 To change this template use File | Settings | File Templates.
 */
public class HomeControllerTest {

    @Test
    public void shouldDisplayRecentSpittes() {
        List<Spittle> expectedSpittles = asList(new Spittle(), new Spittle(), new Spittle());
        SpitterService spitterService = mock(SpitterService.class);
        when(spitterService.getRecenntSpittle(HomeController.DEFAULT_SPITTLES_PER_PAGE)).thenReturn(expectedSpittles);
        HomeController controller = new HomeController(spitterService);

        Map<String, Object> model = new HashMap<String, Object>();
        String viewName = controller.showHomePage(model);

        assertEquals("home", viewName);
        assertSame(expectedSpittles, model.get("spittles"));
        verify(spitterService).getRecenntSpittle(HomeController.DEFAULT_SPITTLES_PER_PAGE);
    }
}
