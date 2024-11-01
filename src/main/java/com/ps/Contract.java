package com.ps;

public class Contract {
    private String contractDate;
    private String customerName;
    private String vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String contractDate, String customerName, String vehicleSold) {
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.vehicleSold = vehicleSold;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();

}
