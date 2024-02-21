package assignment.exception.entities;

import assignment.exception.ScannerUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private LocalDate createdDate;
    private List<Account> accounts;

    public Group() {
        ScannerUtils scannerUtils = new ScannerUtils();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Group Id");
        this.groupId = scannerUtils.inputInt("Enter Group ID: ");

        System.out.println("Enter Group name");
        this.groupName = scannerUtils.inputString();

        System.out.println("Enter Group Creator");
        this.creator = new Account();

        this.createdDate = LocalDate.now();

        while (true) {
            System.out.println("Do you want to add accounts for groups? Enter 1 if Yes or 2 if No");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                this.accounts = new ArrayList<>();
                while (true) {
                    Account account = new Account();
                    accounts.add(account);

                    System.out.println("Do you want to add another account? Enter 1 if Yes or any if No");
                    int continueChoice = sc.nextInt();
                    sc.nextLine();
                    if (continueChoice != 1) {
                        break;
                    }
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice, please enter 1 or 2.");
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createdDate=" + createdDate +
                ", accounts=" + accounts +
                '}';
    }
}
