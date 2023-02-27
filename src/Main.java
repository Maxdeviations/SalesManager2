public class Main {
    public static void main(String[] args) {
        long[] sales = new long[] {6, 4, 3};
        SalesManager salesManager2 = new SalesManager(sales);

        long max = salesManager2.max();
        long min = salesManager2.min();
        long average = salesManager2.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}