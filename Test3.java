import java.util.Arrays;

class Test3 {
    public static void main(String[] args) {
        // Initializing a 2D array that represents an apartment building
        String[][] apartments = {
                {"Apt 101", "Apt 102"},
                {"Apt 201", "Apt 202"}
        };

        // Adding a new floor to the apartment building
        apartments = addNewFloor(apartments, new String[]{"Apt 301", "Apt 302"});

        // TODO: Make a walk visiting each apartment on every floor of the updated building.
        for (String[] apartment : apartments) {
            for (String s : apartment) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    // TODO: Add a method `addNewFloor` to add a new floor with apartments to our 'apartment building'.
    private static String[][] addNewFloor(String[][] apartments, String[] strings) {
        int old_length = apartments.length;
        apartments = Arrays.copyOf(apartments, apartments.length + 1);
        apartments[old_length] = strings;
        return apartments;
    }

}
