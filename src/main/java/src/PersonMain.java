package src;

public class PersonMain {

    public static void main(String[] args) {
        Person person1 = new Person("Ryan", 30 , "male", new String[]{"being a hardarse","agile","ssd hard drives."});
        String greetings = person1.hello();
        System.out.println(greetings);
    }
}
