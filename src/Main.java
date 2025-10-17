public class Main {
    public static void main(String[] args){

        PhoneBook book = new PhoneBook();

        book.add("Иванов", "123-45-67");
        book.add("Петров", "987-65-43");
        book.add("Иванов", "567-89-01");

        System.out.println("Номера Иванова: " + book.get("Иванов"));
        System.out.println("Номера Петрова: " + book.get("Петров"));
    }
}