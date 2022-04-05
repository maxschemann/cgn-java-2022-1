package smartphone;

public class Friend extends Contact {
    private String telephonenumber;

    public Friend(){}

    public Friend(String name, String telephonenumber){
        this.name = name;
        this.telephonenumber = telephonenumber;
    }

    @Override
    public String toString() {
        return "Friend: " +
                "Name" + name +
                "Telephone number='" + telephonenumber ;
    }
}
