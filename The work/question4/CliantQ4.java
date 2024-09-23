class CliantQ4 {
    public String CliantName;
    protected String address;
    private int CliantOrder;

    public CliantQ4(String cliantName, int cliantOrder, String address) {
        CliantName = cliantName;
        CliantOrder = cliantOrder;
        this.address = address;
    }

    public int getCliantOrder() {
        return CliantOrder;
    }

    public String getCliantName() {
        return CliantName;
    }

    public String getAddress() {
        return address;
    }
}