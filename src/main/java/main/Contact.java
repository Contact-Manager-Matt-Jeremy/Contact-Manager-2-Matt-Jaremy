package main;

public class Contact {
    static String contactName;
    static String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }


    public static Contact add(Contact contact) {
        return contact;
    }

    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return " Name='" + contactName + '\'' +
                ", Number='" + contactNumber + '\'';
    }
}
