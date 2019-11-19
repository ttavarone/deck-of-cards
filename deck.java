import java.util.Random;
/*
Creates a default deck and has methods to perform functions
*/
//a standard 52 card deck

class Deck{

  int stackSize = 52; 
	int top; 
	Card cards[] = new Card[stackSize]; // Maximum size of Stack 

  //suit is in order of value by the indexes
  protected int[] rank = {1,2,3,4,5,6,7,8,9,10,11,12,13};
  protected char[] suit = {'s','h','c','d'};
  protected int jack = 11;
  protected int queen = 12;
  protected int king = 13;
  protected int ace = 1;

  public Deck(){}

  boolean isEmpty() 
    { 
        return (top < 0); 
    } 
  Deck() 
  { 
    top = -1; 
  } 

  /* Shuffles the deck */
  public void shuffle(){
    
  }

  /* Draws one card from top and returns a card object */
  public Card draw(){
    if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return null; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        }
  }

  /* Draws a specified amount of cards */
  public Card[] draw(int amt){}

  private static int getRandomNumberInRange(int min, int max) {

	  if (min >= max) {
		  throw new IllegalArgumentException("max must be greater than min");
	  }

	  Random r = new Random();
	  return r.nextInt((max - min) + 1) + min;
	}
}

/*

/* Java program to implement basic stack 
operations */
class Stack { 
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
	Stack() 
	{ 
		top = -1; 
	} 

	boolean push(int x) 
	{ 
		if (top >= (MAX - 1)) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			a[++top] = x; 
			System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 

	int pop() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top--]; 
			return x; 
		} 
	} 

	int peek() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
	} 
} 

// Driver code 
class Main { 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		System.out.println(s.pop() + " Popped from stack"); 
	} 
} 
*/
