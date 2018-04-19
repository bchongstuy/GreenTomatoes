/*****************************************************
 * class QQKachoo
 * Implements DLLNode, for use in deques
 *****************************************************/

public class QQKachoo<D> implements Deque<D> {
    private int _size;
    private DLLNode<D> _front;
    private DLLNode<D> _end;

    public QQKachoo() {
	_size = 0;
	_front = _end = null;
    }
    
    public void addLast() {
    }
    /*
    public Card pollFirst() {
    }
    
    public Card peekFirst() {
         return _front.getValue();
    }
    
    public int size() {
         return _size;
    }
    
    public boolean offerLast() {
    }
    
    public void addFirst() {
    }
    
    public Card pollLast() {
    }
    
    public Card peekLast() {
         return _end.getValue();
    }
    
    public boolean offerFirst() {
    }
    */
    public static void main(String[] args) {
    }
    
}
