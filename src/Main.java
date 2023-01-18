import java.util.Comparator;
import java.util.List;

/**
 * Generates an unordered list with Duplicate values
 * Removes the duplicates
 * Sorts it by descending order
 * Prints result
 */
public class Main {
    public static void main(String[] args) {
        final List<Double> unorderedList = ListUtilities.generateDoublesWithDuplicates(1, 100);
        final List<Double> filteredList = ListUtilities.removeDuplicates(unorderedList)
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(filteredList);
    }
}