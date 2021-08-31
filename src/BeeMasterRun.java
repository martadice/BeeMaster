import org.sqlite.core.DB;

import java.util.Scanner;

public class BeeMasterRun {
//    Welcome to BeeMaster!
//    Please select what you would like to do!
//    Select 1 to show a general information about my bee hives!
//    Select 2 to show information about specific location!
//    Select 3 to show a list of tasks for this week!
//    Select 4 to show and edit the information about the bee hive!
//    Select 5 to add a new bee hive to the location!
//    Select 6 to delete an existing bee hive!
//    Select 0 to exit the application!

    private static DBConnection colonyDb;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        colonyDb = new DBConnection();

        // Creating a MENU
        int menu;

        do {
            System.out.println("Welcome to BeeMaster!");
            System.out.println("Please select what you would like to do:");
            System.out.println("Select 1 to show a general information about my bee hives");
            System.out.println("Select 2 to show information about specific location");
            System.out.println("Select 3 to show a list of tasks for this week");
            System.out.println("Select 4 to show and edit the information about the bee hive");
            System.out.println("Select 5 to add a new bee hive to the location");
            System.out.println("Select 6 to delete an existing bee hive");
            System.out.println("Select 0 to exit the application");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    colonyDb.toString();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("This menu item does not exist");
                    System.out.println("Please double check the number you have entered!");
            }

        } while (menu != 0);


    }
}
