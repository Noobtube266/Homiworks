package hw2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Durran", "Hyland");
        Person person2 = new Person("Elias","Ruff");
        Person person3 = new Person("Kyree", "Brooks");
        Person person4 = new Person("Isaiah","Brown");
        Person person5 = new Person("Justyce", "Williams");


        Person[] names = new Person[5];
        names[0] = person1;
        names[1] = person2;
        names[2] = person3;
        names[3] = person4;
        names[4] = person5;

        PersonHandler humans = new PersonHandler(names);

        System.out.println(humans.forLoop());
        System.out.println(humans.whileLoop());
        System.out.println(humans.forEachLoop());
    }
}
