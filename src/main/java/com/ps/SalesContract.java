package com.ps;

public class SalesContract extends Contract {
    private final double SALES_TAX = 0.05;
    private final double RECORDING_FEE = 100;
    private double processingFee;
    private boolean financeOption;

    public SalesContract(String contractDate, String customerName, String vehicleSold, double processingFee, boolean financeOption) {
        super(contractDate, customerName, vehicleSold);
        this.processingFee = processingFee;
        this.financeOption = financeOption;
    }

}
