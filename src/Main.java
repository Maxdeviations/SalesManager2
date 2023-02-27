public class Main {
    public static void main(String[] args) {
        int[] sales = new int[] {6, 4, 3};
        SalesManager salesManager2 = new SalesManager(sales);
        int max = salesManager2.max();
        System.out.println(max);
    }
}