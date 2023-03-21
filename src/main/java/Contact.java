import java.util.Objects;

public class Contact{

    private String name;
    private String telephoneNumber;

    public Contact(String name, String telephoneNumber){
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,telephoneNumber);
    }

    @Override
    public boolean equals(Object obj){
        Contact o = (Contact)obj;
        return name.equals(o.name) && telephoneNumber.equals(o.telephoneNumber) ;
    }

    @Override
    public String toString(){
        return " " + name + " = " + telephoneNumber;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}