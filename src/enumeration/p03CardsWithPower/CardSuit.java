package enumeration.p03CardsWithPower;

public enum CardSuit {
    CLUBS(0,"CLUBS"),
    DIAMONDS(13,"DIAMONDS"),
    HEARTS(26,"HEARTS"),
    SPADES(39,"SPADES");
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
