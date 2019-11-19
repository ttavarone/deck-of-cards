/*
Creates a default deck and has methods to perform functions
*/
//a standard 52 card deck
class Deck{

  //suit is in order of value by the indexes
  protected int[] rank = {1,2,3,4,5,6,7,8,9,10,11,12,13};
  protected char[] suit = {'s','h','c','d'};
  protected int jack = 11;
  protected int queen = 12;
  protected int king = 13;
  protected int ace = 1;

  public Deck(){}

  /* Shuffles the deck */
  public void shuffle(){}

  /* Draws one card from top and returns a card object */
  public Card draw(){}

  /* Draws a specified amount of cards */
  public Card[] draw(int amt){}
}