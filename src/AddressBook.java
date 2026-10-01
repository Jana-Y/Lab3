import java.util.ArrayList;


public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook(){
        this.buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            buddyList.add(buddy);
        }
    }
    public void removeBuddy(BuddyInfo buddy){
        if (buddy != null) {
            buddyList.remove(buddy);
            System.out.println("Just adding a change to commit");
        }
    }

    public void newFunction(){
        System.out.println("Testing Branching");
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
