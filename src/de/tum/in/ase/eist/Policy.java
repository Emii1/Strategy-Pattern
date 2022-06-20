package de.tum.in.ase.eist;

public class Policy {
    private Context context;

    public Policy(Context context) {
        this.context = context;
    }

    public void configure() {
        if (!context.isChaptersSortedByName()) {
            LinearSearch linearSearch = new LinearSearch();
            context.setSearchAlgorithm(linearSearch);
        } else {
            BinarySearch binarySearch = new BinarySearch();
            context.setSearchAlgorithm(binarySearch);
        }

    }
}
