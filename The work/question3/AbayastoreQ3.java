public class AbayastoreQ3 {
    String AbayastoreName;
    AbayaQ3 Abayas;

    public AbayastoreQ3(String abayastoreName) {
        AbayastoreName = abayastoreName;
    }

    public static void main(String[] args){
        AbayastoreQ3 store = new AbayastoreQ3("Meme Store");
        System.out.println("The Abaya Store Name IS: " + store.AbayastoreName);

        AbayaQ3 Abaya1 = new AbayaQ3(110, "green Abaya");
        System.out.println("The Abaya ID IS: " + Abaya1.getAbayaID());
        System.out.println("The Abaya Name IS: " + Abaya1.getAbayaName());
        AbayaQ3 Abaya2 = new AbayaQ3(111, "pink Abaya");
        System.out.println("The Abaya ID IS: " + Abaya2.getAbayaID());
        System.out.println("The Abaya Name IS: " + Abaya2.getAbayaName());


    }
}