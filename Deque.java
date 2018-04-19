/*****************************************************
 * interface Deque
 * (Local version, to override built-in Java implementation.)
 ******************************************************/

public interface Deque<Card> {

    public void addLast();
    
    public Card pollFirst();
    
    public Card peekFirst();
    
    public int size();
    
    public boolean offerLast();
    
    public void addFirst();
    
    public Card pollLast();
    
    public Card peekLast();
    
    public boolean offerFirst();
    
}//end interface Deque
