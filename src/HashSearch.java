public class HashSearch {
    private Integer[] table;
    private int size;

    public HashSearch(int size) {
        this.size = size;
        this.table = new Integer[size];
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        int startIndex = index;


        while (table[index] != null) {
            System.out.println("Collision trying to insert " + key + " at index " + index + ". Probing forward...");
            index = (index + 1) % size;


            if (index == startIndex) {
                System.out.println("Error: Hash table is full. Cannot insert " + key);
                return;
            }
        }

        table[index] = key;
        System.out.println("Inserted " + key + " successfully at index " + index);
    }


    public int search(int key) {
        int index = hashFunction(key);
        int startIndex = index;
        int probes = 1;

        System.out.println("\n--- Searching for " + key + " ---");

        while (table[index] != null) {
            if (table[index] == key) {
                System.out.println("Found " + key + " at index " + index + " after " + probes + " probe(s).");
                return index;
            }
            System.out.println("Bucket " + index + " contains " + table[index] + ". Probing forward...");
            index = (index + 1) % size;
            probes++;

            if (index == startIndex) {
                break;
            }
        }

        System.out.println("Target " + key + " was not found in the table.");
        return -1;
    }


    public void displayTable() {
        System.out.println("\n--- Current Hash Table State ---");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] == null ? "[Empty]" : table[i]));
        }
    }
}
