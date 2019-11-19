class Card {
  /*
  d = diamonds
  h = hearts
  s = spades
  c = clubs
  1 = ace - 13 king
  r = red
  b = black
  */

  public char suit;
  public int rank;

  public Card(char suit, int rank){
    suit = this.suit;
    rank = this.rank;
  }
  public Card(){
    suit = 'c';
    color = 'b';
    rank = 1;
  }

  public int getRank(){
    return rank;
  }

  public void setRank(int rank){
    rank = this.rank;
  }

  public car getSuit(){
    return suit;
  }

  public void setSuit(char suit){
    suit = this.suit;
  }
}