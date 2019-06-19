public class ArryRev {

    private static int[] numbs = {1, 2, 3, 4, 5, 6};

    private static int j = numbs.length;

    public static void main(String[] args) { int i;

        int[] temp = new int[numbs.length];

        for (i = 0; i < numbs.length; i++) {
            j--;

            temp[i]=numbs[j];

            System.out.print(temp[i]);

        }
        for (i = 0; i < numbs.length; i++) {
            numbs[i]=temp[i];
        }
    }
}
