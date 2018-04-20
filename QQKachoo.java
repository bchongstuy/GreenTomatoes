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

    //The way the DLLNodes point should not matter because they point in both directions anyways
    //DLLNode Constructor Order: ( Cargo , Previous, Next )
    public void addLast(D insert) {
	if (_size == 0 ) {
	    DLLNode<D> holder = new DLLNode<D>(insert, null , null);
	    _front = holder;
	    _end = holder;
	}
	else if (_size == 1) {
	    DLLNode<D> holder = new DLLNode<D>(insert, null, _front );
	    _front.setPrev(holder);
	    _end = holder;
	}
	else {
	    DLLNode<D> holder = new DLLNode<D>(insert, null, _end);
	    _end.setPrev(holder);
	    _end = holder;
	}
	_size++; 
    }
    
    public D pollFirst() {
	if (_size == 0 ) {
	    return null;
	}
	else {
	    D holder = _front.getCargo(); //Take the front cargo
	    _front.getPrev().setNext(null); //Make the DLLNode behind it's front become null
	    _front = _front.getPrev(); //Make the DLLNode behind it the front
	    _size--;
	    return holder;
	}
    }

    public D peekFirst() {
         return _front.getCargo();
    }

    
    public int size() {
         return _size;
    }

    /*
    
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
