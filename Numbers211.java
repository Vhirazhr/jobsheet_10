/**
 * Numbers11
 */
public class Numbers211 {

    public static void main(String[] args) {

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[5];
        myNumbers[2] = new int[5];

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                myNumbers[i][j] = i + j; // Some example value assignment
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

        // Print the length of each row
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}
