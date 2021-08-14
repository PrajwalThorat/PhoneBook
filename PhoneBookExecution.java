import java.util.Scanner;

public class PhoneBookExecution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneBook phoneBook = new PhoneBook();

        while(true){
            System.out.println("1. Add contact\n2. Display\n3. Exit");
            System.out.print("Choose option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1: phoneBook.addContact();
                break;
                case 2: phoneBook.display();
                break;
                case 3: System.exit(0);
            }
        }



    }
    
}
