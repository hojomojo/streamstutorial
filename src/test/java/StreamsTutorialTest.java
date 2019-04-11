import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class StreamsTutorialTest {

    private StreamsTutorial streamsTutorial = new StreamsChallengeAnswers();

    @Test
    public void filterByStartingWithA() {
        assertThat(streamsTutorial.filterByStartingWithA(), containsInAnyOrder("aaa2", "aaa1"));
    }

    @Test
    public void  filterByStartingWithASorted() {
        assertThat(streamsTutorial.filterByStartingWithASorted(), contains("aaa1", "aaa2"));
    }

    @Test
    public void  changeToUpperCaseAndReverseOrder() {
        assertThat(streamsTutorial.changeToUpperCaseAndReverseOrder(), contains("DDD2", "DDD1", "CCC", "BBB3", "BBB2", "BBB1", "AAA2", "AAA1"));
    }

    @Test
    public void  concatenateToSingleHashDelimitedString() {
        assertEquals(streamsTutorial.concatenateToSingleHashDelimitedString(), "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2");
    }
}