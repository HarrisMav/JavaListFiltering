import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generic class to provide utilities not provided by the base Java libraries
 */
public class ListUtilities {

    /**
     * Generating a list of random numbers between a min and max value. Then it substracts the amount of duplicates we
     * need by the amount of doubles we want, that difference will create an amount of unique numbers we need generated.
     *
     * Amount of duplicates and amount of doubles can also be used as parameters though for the purpose of the exercise
     * we can leave it like this. Code has to be extended if those 2 can vary since if the amt of dups and amt of doubles are equal
     * this is not going to work.
     * @param min value of the range
     * @param max value of the range
     * @return a list with duplicates
     */
    public static List<Double> generateDoublesWithDuplicates(final double min, final double max){
        final Random random = new Random();
        final int amountOfDuplicates = 4;
        final int amountOfDoubles = 10;
        final int amountOfUniqueNumbers = amountOfDoubles - amountOfDuplicates;
        final ArrayList<Double> listWithDuplicates = new ArrayList<>();

        for (int i = 0; i < amountOfUniqueNumbers; i++) {
            listWithDuplicates.add(random.nextDouble(max - min + 1) + min);
        }

        return listWithDuplicates;
    }

    /**
     * Creating a unique list and loading the random numbers in.
     *
     * @param unfilteredList list with duplicates
     * @return a list without
     */
    public static List<Double> removeDuplicates(final List<Double> unfilteredList){
        ArrayList<Double> filteredList = new ArrayList<>();

        for (final Double value : unfilteredList) {
            if (filteredList.contains(value)) continue;
            filteredList.add(value);
        }

        return filteredList;
    }
}
