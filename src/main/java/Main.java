import java.util.Map;
import java.util.concurrent.Callable;

class Main {
    public static void main(String[] args) {

        Contact lexa = new Contact("Леха", "8-495-189-33-11");
        Contact canek = new Contact("Санек", "8-211-651-11-22");
        Contact irka = new Contact("Ирка", "8-888-888-88-88");
        Contact vika = new Contact("Вика", "1122");
        Contact vanek = new Contact("Ванька", "8-888-11");



        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createGroup("Друзья");
        phoneBook.createGroup("Работа");
        phoneBook.createGroup("Коллекторы");
        phoneBook.createGroup("Друзья");


        phoneBook.addContactToGroups(lexa, "Друзья", "Коллекторы", "Работа");
        phoneBook.addContactToGroups(canek, "Работа");
        phoneBook.addContactToGroups(irka, "Коллекторы");
        phoneBook.addContactToGroups(vika, "Работа", "Друзья");
        phoneBook.addContactToGroups(vika,"Какие - то типы");
        phoneBook.addContactToGroups(vanek, "Друзья");

        MissedCalls missedCalls = new MissedCalls(phoneBook);
        missedCalls.addMissedCalls("1122");
        missedCalls.addMissedCalls("777721");
        missedCalls.addMissedCalls("8-888-11");
        System.out.println(missedCalls);



    }
}