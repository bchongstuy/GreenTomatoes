/*****************************************************
 * interface Deque
 * (Local version, to override built-in Java implementation.)
 ******************************************************/

public interface Deque<Card> {

    public void addLast(Card insert);

    public Card pollFirst();
    
    public Card peekFirst();

    public int size();
    
    public void addFirst(Card insert);  
  
    public Card pollLast();
    
    public Card peekLast();
    
}//end interface Deque
