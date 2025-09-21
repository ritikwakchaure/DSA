import java.util.Scanner;

public class PatternPrinter {

    // Right-angled triangle of stars
    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Inverted right-angled triangle
    public static void invertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Mirrored right triangle
    public static void mirroredRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Pyramid (centered)
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Inverted pyramid
    public static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Diamond
    public static void diamond(int n) {
        pyramid(n);
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Hollow square
    public static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Hollow triangle (right-angled)
    public static void hollowRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Floyd's triangle (numbers)
    public static void floydsTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print((num++) + " ");
            System.out.println();
        }
    }

    // Number pyramid (palindromic)
    public static void palindromicNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // Numeric half pyramid
    public static void numericHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // Alphabet triangle (A, BB, CCC style)
    public static void alphabetTriangle(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(ch);
            ch++;
            System.out.println();
        }
    }

    // Pascal's triangle (n rows)
    public static void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int coeff = 1;
            for (int s = 0; s <= n - i - 2; s++) System.out.print("  ");
            for (int j = 0; j <= i; j++) {
                System.out.print(coeff + " ");
                coeff = coeff * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    public static void butterfly(int n) {
        // top
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        // bottom
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Diamond of numbers
    public static void numberDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
    }

    // Main menu-driven demo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern Printer - choose number and size:");
        System.out.println("1. Right triangle\n2. Inverted right triangle\n3. Mirrored right triangle\n4. Pyramid\n5. Inverted pyramid\n6. Diamond\n7. Hollow square\n8. Hollow right triangle\n9. Floyd's triangle\n10. Palindromic number pyramid\n11. Numeric half pyramid\n12. Alphabet triangle\n13. Pascal's triangle\n14. Butterfly\n15. Number diamond\n0. Exit");
        while (true) {
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice == 0) break;
            System.out.print("Enter size (n): ");
            int n = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> rightTriangle(n);
                case 2 -> invertedRightTriangle(n);
                case 3 -> mirroredRightTriangle(n);
                case 4 -> pyramid(n);
                case 5 -> invertedPyramid(n);
                case 6 -> diamond(n);
                case 7 -> hollowSquare(n);
                case 8 -> hollowRightTriangle(n);
                case 9 -> floydsTriangle(n);
                case 10 -> palindromicNumberPyramid(n);
                case 11 -> numericHalfPyramid(n);
                case 12 -> alphabetTriangle(n);
                case 13 -> pascalTriangle(n);
                case 14 -> butterfly(n);
                case 15 -> numberDiamond(n);
                default -> System.out.println("Invalid choice\n");
            }
            System.out.println();
        }
        sc.close();
    }
}
