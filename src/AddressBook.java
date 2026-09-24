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
    public void removeBuddy(int index){
        if (index >= 0 && index < buddyList.size()) {
            buddyList.remove(index);
        }
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}