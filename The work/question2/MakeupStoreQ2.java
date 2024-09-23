public class MakeupStoreQ2 {
private static int productID;
private String productName;

static{
    productID = 221;
}

    public MakeupStoreQ2(String productName) {
        this.productName = productName;
    }

    public static int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public static void  main(String[] args){
        MakeupStoreQ2 product = new MakeupStoreQ2("eyeliner");
        System.out.println("The product ID is: " + product.getProductID());
        System.out.println("The product Name is: " + product.getProductName());

    }
}