import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); 
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = 27;
        boolean guessed = false;

        for (int i = 1; i <= 5; i++) {
            int guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("Too Low");
            } 
            else if (guess > secret) {
                System.out.println("Too High");
            } 
            else {
                System.out.println("Congratulations");
                guessed = true;
                break;
            }
        }

        if (!guessed) {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;

                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact = fact * j;
                }

                sum = sum + fact;
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
