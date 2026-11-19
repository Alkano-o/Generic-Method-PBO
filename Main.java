public class Main {
    public static void main(String[] args) {
        // Test case bawaan (Integer & String)
        System.out.println("=== Pengujian Integer & String ===");
        System.out.println("5 == 5                 : " + CompareUtil.isEqual(5, 5));
        System.out.println("\"Hello\" == \"World\"     : " + CompareUtil.isEqual("Hello", "World"));

        // Test case tambahan untuk tipe Double
        System.out.println("\n=== Pengujian Double ===");
        System.out.println("3.14 == 3.14           : " + CompareUtil.isEqual(3.14, 3.14));
        System.out.println("9.75 == 8.50           : " + CompareUtil.isEqual(9.75, 8.50));

        // Test case tambahan untuk tipe Character
        System.out.println("\n=== Pengujian Character ===");
        System.out.println("'A' == 'A'             : " + CompareUtil.isEqual('A', 'A'));
        System.out.println("'A' == 'B'             : " + CompareUtil.isEqual('A', 'B'));
    }
}