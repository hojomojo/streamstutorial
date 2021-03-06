import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.Map;

@Data
abstract class StreamsTutorial {

    @Data
    class Person {
        @NonNull
        private String name;
        @NonNull
        private int salary;
    }

    private List<String> stringList;

    private List<Person> personList;

    StreamsTutorial() {
        stringList = List.of("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");
        personList = List.of(new Person("Bob", 1000), new Person("Sally", 2000), new Person("Eve", 1050));
    }

    // =============== String challenges =============== //
    
    abstract List<String> filterByStartingWithA();

    abstract List<String> filterByStartingWithASorted();

    abstract List<String> changeToUpperCaseAndReverseOrder();

    abstract String concatenateToSingleHashDelimitedString();

    // =============== Person challenges =============== //

    abstract Map<String, Integer> mapOfNamesToSalary();

    abstract int totalSalaryCost();

    abstract long peopleWithThreeLetterNames();

    abstract void giveEveryoneAThousandPoundPayrise();

    // =============== Additional challenges =============== //

    abstract List<String> splitStringToCollection(String inputString, String separator);



}
