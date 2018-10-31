
public class Testing
{
    public static void main(String[] args)
    {
        String str1, str2, str3;
        str1 = "One space";
        str2 = "Two spaces";
        str3 = "Three spaces";
        int i = 41;
        double d = 233.521234;
        System.out.printf("%10s%n", str1);
        System.out.printf("%12s%n", str2);
        System.out.printf("%-15s%n", str3);
        System.out.printf("%6d%n", i);
        System.out.printf("%10.2f%n", d);
        System.out.printf("%5.2f", 34.543);
    }
}