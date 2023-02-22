package main;

public class Contact {
    String contactName;
    String contactNumber;

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


    public String toFileString() {
        return String.format("%s,%s", contactName, contactNumber);
    }

    public static Contact fromFileString(String fileString) {
        // file format is name,health,strength
        String [] pieces = fileString.split(",");
        Contact fighter = new Contact(Integer.parseInt(pieces[0]));
        contact.setcontactNumber(Integer.parseInt(pieces[1]));
        return fighter;
    }





    @Override
    public String toString() {
        return " Name='" + contactName + '\'' +
                ", Number='" + contactNumber + '\'';
    }
}
