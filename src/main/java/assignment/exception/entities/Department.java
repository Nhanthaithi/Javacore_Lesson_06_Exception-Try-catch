package assignment.exception.entities;

import assignment.exception.ScannerUtils;

public class Department {
    private int id;
    private String name;

    public Department() {
        ScannerUtils scannerUtils = new ScannerUtils();

        System.out.println("Enter Dep Id");
        this.id = scannerUtils.inputInt("Invalid Input Interger");

        System.out.println("Enter Dep name");
        this.name = scannerUtils.inputString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
