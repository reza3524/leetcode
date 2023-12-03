package array.hindex;

public class Main {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    private static int hIndex(int[] citations) {
        int min = 0;
        int max = citations.length;
        while (min < max) {
            int counter = 0;
            int middle = (min + max + 1) / 2;
            for (int citation : citations) {
                if (citation >= middle) {
                    counter += 1;
                }
            }
            if (counter >= middle) {
                min = middle;
            } else {
                max = middle - 1;
            }
        }
        return min;
    }
}
