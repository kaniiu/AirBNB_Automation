package payment;

public class PaymentForm2 {
    public static void main(String[] args) {
        PaymentForm2 form = new PaymentForm2();
        form.processPayment("credit", 150.0);
        form.processPayment("cash", 50.0);
        form.processPayment("crypto", 75.0); // Unsupported type
    }

    public void processPayment(String type, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be greater than 0.");
            return;
        }

        if (type.equalsIgnoreCase("credit") || type.equalsIgnoreCase("debit") || type.equalsIgnoreCase("cash")) {
            System.out.println("Processed " + type + " payment of $" + amount);
        } else {
            System.out.println("Error: Unsupported payment type.");
        }
    }
}

