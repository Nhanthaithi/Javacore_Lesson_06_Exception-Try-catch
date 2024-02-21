package assignment.exception.entities;

import assignment.exception.ScannerUtils;

import java.time.LocalDate;

public class Account {
    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createdDate;

    public Account() {
        ScannerUtils scannerUtils = new ScannerUtils();
        System.out.println("Enter Acc Id");
        this.accountId = scannerUtils.inputInt("Enter account ID: ");

        System.out.println("Enter Acc email");
        this.email = scannerUtils.inputString();

        System.out.println("Enter Acc username");
        this.userName = scannerUtils.inputString();

        System.out.println("Enter Acc fullname");
        this.fullName = scannerUtils.inputString();

        this.department = new Department();

        this.position = new Position();

        this.createdDate = LocalDate.now();
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createdDate=" + createdDate +
                '}';
    }
}
