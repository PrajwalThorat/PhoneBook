import java.util.Scanner;

public class PhoneBook {
    //has a relation
    private Contact[] contactList;
    private int count;

    public PhoneBook(){
        contactList = new Contact[10];
        count = 0;
    }

    public void addContact(){
        if(count>= contactList.length){
            System.out.println("Phone book is full");
        }else{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            System.out.print("Enter mobile:");
            String mobile = scanner.nextLine();
            System.out.print("Enter email:");
            String email = scanner.nextLine();

            Contact contact = new Contact();
            contact.setName(name);
            contact.setMobile(mobile);
            contact.setEmail(email);

            contactList[count]  = contact;
            count++;
        }
    }

    public void display(){
        for(int index = 0; index<count;index++){
            Contact contact = contactList[index];
            //System.out.println(contact.getName()+ " "+ contact.getMobile() +" "+ contact.getEmail());
            contact.display();
        }
    }
}
