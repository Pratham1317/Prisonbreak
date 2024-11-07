package pkg1;

public class PrisonCells {

    public static void main(String[] args) {
        int n = 100;
        boolean[] cells = new boolean[n + 1]; // false means closed, true means open

        // Toggle cells according to the rules
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                cells[j] = !cells[j];
            }
        }

        // Output cells that remain open
        System.out.print("Open cells: ");
        for (int i = 1; i <= n; i++) {
            if (cells[i]) {
                System.out.print(i + " ");
            }
        }
    }
}