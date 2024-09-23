public class AbayaStoreQ1 {
    private int AbayaID;
    private String AbayaName;
    {
        AbayaID = 111;
        AbayaName = "open Abaya";
    }

    public AbayaStoreQ1(int abayaID, String abayaName) {
        AbayaID = abayaID;
        AbayaName = abayaName;
    }

    public int getAbayaID() {
        return AbayaID;
    }

    public String getAbayaName() {
        return AbayaName;
    }

    public static void main(String[] args){
        AbayaStoreQ1 Abaya1 = new AbayaStoreQ1(111 , "open Abaya");
        System.out.println("The Abaya ID is: " + Abaya1.getAbayaID());
        System.out.println("The Abaya Name is: " + Abaya1.getAbayaName());

        AbayaStoreQ1 Abaya2 = new AbayaStoreQ1(112 , "magic Abaya");
        System.out.println("The Abaya ID is: " + Abaya2.getAbayaID());
        System.out.println("The Abaya Name is: " + Abaya2.getAbayaName());
    }
}