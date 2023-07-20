package Task01;
// Создайте класс "Кот" (Cat) со следующими свойствами:
// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. 
// Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида: 
// "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

public class Cat {
    private String name;
    private int age;
    Owner catowner = new Owner();
    public String setName (String name) {
        return this.name = name;
    }
    public int setAge (int age) {
        return this.age = age;
    }
    public String getName () {
        return this.name;
    }
    public int getAge () {
        return this.age;
    }
    public String setOwnerName (String owner) {
        return catowner.setName(owner);
    }
    public String getOwnerName () {
        return catowner.getName();
    }
    public String greetings () {
        return ("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года (лет)"+ ". Моя хозяйка - " + getOwnerName());
    }
}