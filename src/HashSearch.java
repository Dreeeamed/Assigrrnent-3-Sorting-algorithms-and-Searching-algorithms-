public class HashSearch {
    private final Integer[] table;
    private final int size;
    public HashSearch(int size) {
        this.size = size;
        this.table = new Integer[size];
    }

    public void insert(int key) {
        int index = key % size;
        int originalIndex = index;

        while (table[index] != null) {
            System.out.println("Collision for key " + key + " at index " + index + " Probing");
            index = (index + 1) % size;
            if (index == originalIndex) {
                System.out.println("Hash table is full. Cannot insert " + key);
                return;
            }
        }
        table[index] = key;
    }

    public void printTable() {
        System.out.println("Hash Table State:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] == null ? "Empty" : table[i]));
        }
    }
}
