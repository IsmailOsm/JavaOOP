package enumeration.p01CardSuit;

public enum CardSuit {
    CLUBS(0,"CLUBS"),
    DIAMONDS(1,"DIAMONDS"),
    HEARTS(2,"HEARTS"),
    SPADES(3,"SPADES");
    private int ordinalValue;
    private String name;

    CardSuit(int ordinalValue, String name) {
        this.ordinalValue = ordinalValue;
        this.name = name;
    }

    public int getOrdinalValue() {
        return ordinalValue;
    }

    public String getName() {
        return name;
    }
}
