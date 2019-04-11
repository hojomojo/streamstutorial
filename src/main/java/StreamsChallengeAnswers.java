import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

class StreamsChallengeAnswers extends StreamsTutorial {

    @Override
    List<String> filterByStartingWithA() {
        return this.getStringCollection()
                .stream()
                .filter((s) -> s.startsWith("a"))
                .collect(toList());
    }

    @Override
    List<String> filterByStartingWithASorted() {
        return this.getStringCollection()
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .collect(toList());
    }

    @Override
    List<String> changeToUpperCaseAndReverseOrder() {
        return this.getStringCollection()
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    @Override
    String concatenateToSingleHashDelimitedString() {
        return this.getStringCollection()
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2)
                        .orElseThrow();
    }
}
