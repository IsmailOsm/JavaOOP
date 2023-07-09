package enumeration.p03CardsWithPower;

public class Card {
    public static int cardPower(CardRank rank, CardSuit suit) {
        return rank.getRank() + suit.getOrdinalValue();
    }
}
