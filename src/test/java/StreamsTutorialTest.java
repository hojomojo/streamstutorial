import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class StreamsTutorialTest {

    private StreamsTutorial streamsTutorial = new StreamsChallenge();

    @Test
    public void filterByStartingWithA() {
        assertThat(streamsTutorial.filterByStartingWithA(), containsInAnyOrder("aaa2", "aaa1"));
    }

    @Test
    public void filterByStartingWithASorted() {
        assertThat(streamsTutorial.filterByStartingWithASorted(), contains("aaa1", "aaa2"));
    }

    @Test
    public void changeToUpperCaseAndReverseOrder() {
        assertThat(streamsTutorial.changeToUpperCaseAndReverseOrder(), contains("DDD2", "DDD1", "CCC", "BBB3", "BBB2", "BBB1", "AAA2", "AAA1"));
    }

    @Test
    public void concatenateToSingleHashDelimitedString() {
        assertEquals("aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2", streamsTutorial.concatenateToSingleHashDelimitedString());
    }

    @Test
    public void mapOfNamesToSalary() {
        assertEquals( Map.of("Bob", 1000,"Sally", 2000,"Eve", 1050), streamsTutorial.mapOfNamesToSalary());
    }

    @Test
    public void peopleWithThreeLetterNames() {
        assertEquals(2, streamsTutorial.peopleWithThreeLetterNames());
    }

    @Test
    public void totalSalaryCost() {
        assertEquals(4050, streamsTutorial.totalSalaryCost());
    }

    @Test
    public void giveEveryoneAThousandPoundPayrise() {
        streamsTutorial.giveEveryoneAThousandPoundPayrise();
        assertEquals(streamsTutorial.mapOfNamesToSalary(), Map.of("Bob", 2000,"Sally", 3000,"Eve", 2050));
    }

    @Test
    public void splitStringToCollection() {
        assertEquals(List.of("a","b","c","d","e","f"), (streamsTutorial.splitStringToCollection("a,b,c,d,e,f", ",")));
    }
}