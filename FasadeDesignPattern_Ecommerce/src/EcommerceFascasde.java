public class EcommerceFascasde {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShipingService shipingService;

    public EcommerceFascasde(){
        this.inventoryService=new InventoryService();
        this.paymentService=new PaymentService();
        this.shipingService=new ShipingService();

    }
    public void placeOrder(String productId,String address,Double amount,String accountID){
        System.out.println("Processing Order............");

        if(!inventoryService.checkStock(productId)){
            System.out.println("product is out of stock");
            return;
        }
        if(!paymentService.processPayment(accountID,amount)){
            System.out.println("Payment failed");
        }
      String shippinng_code=shipingService.arrangeShiping(productId,address);
        System.out.println("Product dispatch with trackID:"+shippinng_code);
    }
}
