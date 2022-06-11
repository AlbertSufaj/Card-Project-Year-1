public class Card implements Comparable{
    long id;
    String name;
    Rank rank;
    long price;

    public Card(long id, String name, Rank rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.price = 0;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Rank: " + rank + " Price: " + price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (rank == null ? 0 : rank.hashCode());
        return hash;
    }

    public boolean equals(Card card) {
        return ((id == card.id) && (name.equals(card.name)) && (rank.equals(card.rank)));
    }
    public int compareTo(Card card){
        int compareVal = this.name.compareTo(card.name);
        if (compareVal == 0){
            return this.rank.compareTo(card.rank);
        }
        else{
            return compareVal;
        }
    }

}