import lombok.Data;

import java.util.List;

@Data
public abstract class StreamsTutorial {

    private List<String> stringCollection;

    StreamsTutorial() {
        stringCollection = List.of("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");
    }

    abstract List<String> filterByStartingWithA();

    abstract List<String> filterByStartingWithASorted();

    abstract List<String> changeToUpperCaseAndReverseOrder();

    abstract String concatenateToSingleHashDelimitedString();
}
