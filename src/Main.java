public class Main {
    public static void main(String[] args) {
        MagicBox<String> magic = new MagicBox<>(5);
        magic.add("Something");
        magic.add("happened");
        magic.add("on");
      //  System.out.println(magic.pick());
        magic.add("the");
        magic.add("way");
        magic.add("...");
        System.out.println(magic.pick());
    }
}