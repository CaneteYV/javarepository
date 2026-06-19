package Basic_Structure_and_Syntax;

 public class CafeScenario {
    public static void main(String[] args) {
        
       
        byte itemsOrdered = 2;
        
     
        short orderNumber = 245;
        
        
        int loyaltyPoints = 12550;
        
       
        long transactionId = 9876543210L;
        
  
        float taxRate = 0.08f;
            
        double totalBill = 14.95;
        
        
        char cupSize = 'L';
        
        
        boolean broughtReusableCup = true;

        
        
        var customerName = "Yvhan";           
        var cashGiven = 20.00;               
        var regularCustomer = true;         
        
        // --- The Cashier's Screen Output ---
        System.out.println("=== COFFEE SHOP RECEIPT ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Is Regular? " + regularCustomer);
        System.out.println("Order #" + orderNumber + " | TXID: " + transactionId);
        System.out.println("---------------------------");
        System.out.println("Items: " + itemsOrdered + " (Size: " + cupSize + ")");
        System.out.println("Reusable Cup Discount Applied: " + broughtReusableCup);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Total Due: $" + totalBill);
        System.out.println("Cash Tendered: $" + cashGiven);
        System.out.println("---------------------------");
        System.out.println("Current Loyalty Points Balance: " + loyaltyPoints);
        System.out.println("Have a great day!");
    }
}
