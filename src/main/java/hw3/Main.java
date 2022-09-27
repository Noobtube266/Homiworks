package hw3;

public class Main {
    public static void main(String[] args) {
        PhoneBook a = new PhoneBook();
        a.add("John", "302");
        a.addAll("Bob",  "312", "567");
        a.addAll("Dooran", "419");
        //a.remove("Dooran");
        System.out.println(a.hasEntry("op"));
        System.out.println(a.lookup("Bob"));
        System.out.println(a.reverseLookup("312"));
        System.out.println(a.getAllContactNames());
        System.out.println(a.getMap());
    }
}
