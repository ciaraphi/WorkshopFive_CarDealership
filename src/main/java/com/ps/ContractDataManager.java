package com.ps;
import java.io.BufferedReader;
        import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ContractDataManager {
    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(("contracts.txt", true))) {
            writer.write("contract Date: " + contract.contractDate);
            writer.write("customer Name: " + contract.customerName);
            writer.write("vehicle Sold: " + contract.vehicleSold);
            writer.write("Total Price: " + contract.gettotalPrice);
            writer.write("Monthly Payment: " + contract.getmonthlyPayment);

            if (contract instanceof SalesContract) {
                writer.write("Contact Type: Sales Contract");
            } else if (contract instanceof LeaseContract) {
                writer.write("Contract Type: Lease Contract");
            }
            writer.newLine();
        }catch (IOException e) {
            e.printStackTrace();
        }

}
        }


        }
    }
}
