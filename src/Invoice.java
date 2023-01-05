public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(String pN, String pD, int qN, double pI) {
        this.partDescription = pD;
        this.pricePerItem = pI;
        this.quantity = qN;
        this.partNumber = pN;
    }
        public double getInvoiceAmount(){
         return quantity * pricePerItem;

    }
        public static void main(String[] args){
        Invoice invoice1= new Invoice("456", "wide", 50,2.5);
        System.out.println(invoice1.getInvoiceAmount());
        }

}
