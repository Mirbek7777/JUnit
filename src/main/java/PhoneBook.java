import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PhoneBook {

    //String group;
    //protected String[] groups;
    private Map<String, List<Contact>> map = new HashMap<>();


    public void createGroup(String group) {
        if (map.containsKey(group)) {
            System.out.println("Такая группа уже существует, придумайте иное название...");
        } else {
            map.put(group, new ArrayList<>());
        }
    }


    public void addContactToGroups(Contact contact, String ... groups) {
        for (String group : groups){
            if(!map.containsKey(group)){
                System.out.println("Такой группы нет, проверте правильность ввода");
                break;
            }
            map.get(group).add(contact);
            System.out.println("Контакт " + contact + " успешно добавлен в группу " + group);
        }

    }

    public List<Contact>  getGroups(String group) {
        return map.get(group);
    }

    public Contact getContact(String number) {
        for (List<Contact> group : map.values()) {
            for (Contact contact : group) {
                if (number.equals(contact.getTelephoneNumber())) {
                    return contact;
                }
            }
        }

        return null;
    }


}