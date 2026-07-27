import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] ans = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println("Result:");

        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[2 * n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i + n] = arr[i];
        }

        System.out.println("Concatenated Array:");

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("Running Sum:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int r = sc.nextInt();

        System.out.print("Enter number of banks: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter balances:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for(int i = 0; i < r; i++) {

            int sum = 0;

            for(int j = 0; j < c; j++) {
                sum += arr[i][j];
            }

            if(sum > max) {
                max = sum;
            }
        }

        System.out.println("Maximum Wealth = " + max);
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[2 * n];
        int[] result = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " elements:");

        for(int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 0;

        for(int i = 0; i < n; i++) {
            result[k++] = arr[i];
            result[k++] = arr[i + n];
        }

        System.out.println("Shuffled Array:");

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];

        System.out.println("Enter candies:");
        for(int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extra = sc.nextInt();

        int max = candies[0];

        for(int i = 1; i < n; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        System.out.println("Result:");

        for(int i = 0; i < n; i++) {
            if(candies[i] + extra >= max)
                System.out.print("true ");
            else
                System.out.print("false ");
        }
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of gains: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter gains:");

        for(int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int altitude = 0;
        int highest = 0;

        for(int i = 0; i < n; i++) {
            altitude = altitude + gain[i];

            if(altitude > highest) {
                highest = altitude;
            }
        }

        System.out.println("Highest Altitude = " + highest);
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++) {

            int num = arr[i];
            int digits = 0;

            if(num == 0) {
                digits = 1;
            } else {
                while(num != 0) {
                    digits++;
                    num = num / 10;
                }
            }

            if(digits % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                }

            }

        }

        System.out.println("Good Pairs = " + count);
    }
}

import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] operations = new String[n];

        System.out.println("Enter operations:");

        for(int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        int x = 0;

        for(int i = 0; i < n; i++) {

            if(operations[i].equals("++X") || operations[i].equals("X++")) {
                x++;
            } else {
                x--;
            }

        }

        System.out.println("Final Value = " + x);
    }
}


import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {

            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
            }

        }

        System.out.println("Sum = " + sum);
    }
}
import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        System.out.println("Kelvin = " + kelvin);
        System.out.println("Fahrenheit = " + fahrenheit);

    }
}
import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

    }
}
import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentence = new String[n];

        System.out.println("Enter sentences:");

        for(int i = 0; i < n; i++) {
            sentence[i] = sc.nextLine();
        }

        int max = 0;

        for(int i = 0; i < n; i++) {

            int words = 1;

            for(int j = 0; j < sentence[i].length(); j++) {

                if(sentence[i].charAt(j) == ' ') {
                    words++;
                }

            }

            if(words > max) {
                max = words;
            }

        }

        System.out.println("Maximum Words = " + max);

    }
}
import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] < target) {
                    count++;
                }

            }

        }

        System.out.println("Count = " + count);

    }
}
