import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDateTime;


public class MissedCalls {

    private PhoneBook phoneBook;

    public MissedCalls(PhoneBook phoneBook){
        this.phoneBook = phoneBook;
    }

    private Map<LocalDateTime, String> missCall = new TreeMap<>();
    public void addMissedCalls(String phone){
        missCall.put(LocalDateTime.now(), phone);
    }

    @Override
    public String toString(){
        System.out.println("Пропущенные вызовы:");
        for(Map.Entry<LocalDateTime, String> call : missCall.entrySet()){
            Contact contact = phoneBook.getContact(call.getValue());
            if(contact != null){
                System.out.println(call.getKey() + " " +  contact.getName());
                //break;
            }else{
                System.out.println(call.getKey() + " " + call.getValue());
                //break;
            }

        }
        return " ";
    }

}