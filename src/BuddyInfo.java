public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;


    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    static void main() {
        BuddyInfo buddy = new BuddyInfo("Homer","123Address", "123-456-7890");
        System.out.println("Hello " + buddy.getName());
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        System.out.println("making a change to commit");
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }


}


