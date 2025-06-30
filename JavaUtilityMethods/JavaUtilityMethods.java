
public class JavaUtilityMethods {

    public static void printOddNumbers(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void convertDays(int days) {
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        System.out.println(years + " years, " + months + " months, " + days + " days");
    }

    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }

    public static int countWords(String str) {
        String[] words = str.trim().split("\s+");
        return words.length;
    }

    public static double compoundInterest(double p, double r, int t) {
        return p * Math.pow((1 + r / 100), t);
    }

    public static boolean isPalindromePrime(int num) {
        if (!isPrime(num)) return false;
        return num == reverseNumber(num);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + " b=" + b);
    }

    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }

    public static int sumNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static boolean isDuckNumber(int num) {
        String str = Integer.toString(num);
        return str.indexOf('0') > 0;
    }

    public static void printMultiplicationTables() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "	");
            }
            System.out.println();
        }
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d * d;
            num /= 10;
        }
        return sum;
    }

    public static void countCase(String str) {
        int upper = 0, lower = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }

    public static boolean isKaprekar(int num) {
        int sq = num * num;
        String str = Integer.toString(sq);
        int len = str.length();
        for (int i = 1; i < len; i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == num) return true;
        }
        return num == 1;
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static int asciiValue(char ch) {
        return (int) ch;
    }
}
