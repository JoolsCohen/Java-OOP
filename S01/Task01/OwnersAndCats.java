package Task01;

public class OwnersAndCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Анубис");
        cat1.setAge(3);
        cat1.setOwnerName("Юля");
        System.out.println(cat1.greetings());
    }
}