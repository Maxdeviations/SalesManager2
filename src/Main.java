public class Main {
    public static void main(String[] args) {
        long[] sales = new long[] {6, 4, 3};
        SalesManager salesManager2 = new SalesManager(sales);
        long max = salesManager2.max();
        System.out.println(max);
    }
}