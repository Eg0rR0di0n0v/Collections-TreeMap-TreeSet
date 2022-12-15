import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        final int numPerson = 5;
        LinkedList<Person> qPerson = generateClients(numPerson);

    }

    public static LinkedList<Person> generateClients(int numPerson) {
        LinkedList<Person> generateClients = new LinkedList<>();
        Person newPerson = new Person();
        System.out.println("______________DATA______________");
        for (int i = 0; i < numPerson; i++) {
            generateClients.offer(newPerson.generation());
            System.out.println(newPerson);
        }
        System.out.println("________________________________");
        return generateClients;
    }
}
