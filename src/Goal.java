class Goal {
    private int year;
    private int month;
    private int day;
    private String description;
    private double amount;

    public Goal(int year, int month, int day, String description, double amount) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public double getAmount() {
        return amount;
    }
}