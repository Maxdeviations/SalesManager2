public class Main {
    public static void main(String[] args) {
        int[] sales = new int[] {6, 4, 3};
        SalesManager salesManager2 = new SalesManager(sales);
        int max = salesManager2.max();
        int min = salesManager2.min();
        int average = salesManager2.average();
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}