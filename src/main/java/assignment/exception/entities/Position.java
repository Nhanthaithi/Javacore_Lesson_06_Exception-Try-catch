package assignment.exception.entities;

import assignment.exception.ScannerUtils;

public class Position {
    private int positionId;
    private String positionName;

    public Position() {
        ScannerUtils scannerUtils = new ScannerUtils();

        // Nhập ID
        System.out.println("Enter Position Id:");
        this.positionId = scannerUtils.inputInt("Please enter position ID.");

        // Nhập tên vị trí
        System.out.println("Enter Position Name :");
        this.positionName = scannerUtils.inputString();
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
