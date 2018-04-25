/*****************************************************
* class QQKachoo
* Implements DLLNode, for use in deques
*****************************************************/

public class QQKachoo<D> implements Deque<D> {
  private int _size;
  private DLLNode<D> _front;
  private DLLNode<D> _end;

  // default constructor creates an empty deque
  public QQKachoo() {
    _size = 0;
    _front = _end = null;
  }//end default constructor

  //Adds an element to the end of the deque
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
  }//end addLast()

  //Removes and returns the first element of deque
  //Returns null if deque is empty.
  public D pollFirst() {
    if (_size == 0 ) {
      return null;
    }
    else if (_size == 1) {
      D holder = _front.getCargo();
      _size = 0;
      _front = _end = null;
      return holder;
    }
    else {
      D holder = _front.getCargo(); //Take the front cargo
      _front.getPrev().setNext(null); //Make the DLLNode behind it's front become null
      _front = _front.getPrev(); //Make the DLLNode behind it the front
      _size--;
      return holder;
    }
  }//end pollFirst()

  //Returns the first element of deque without removing
  public D peekFirst() {
    return _front.getCargo();
  }//end peekFirst()

  //Returns the number of elements in Deque
  public int size() {
    return _size;
  }//end size()

  //Adds an element to the front of the deque
  public void addFirst(D insert) {
    if (_size == 0 ) {
      DLLNode<D> holder = new DLLNode<D>(insert, null , null);
      _front = holder;
      _end = holder;
    }
    else if (_size == 1) {
      DLLNode<D> holder = new DLLNode<D>(insert, _end, null );
      _end.setNext(holder);
      _front = holder;
    }
    else {
      DLLNode<D> holder = new DLLNode<D>(insert, _front, null);
      _front.setNext(holder);
      _front = holder;
    }
    _size++;
  }//end addFirst()

  //Removes and returns the last element of deque
  public D pollLast() {
    if (_size == 0 ) {
      return null;
    }
    else if (_size == 1) {
      D holder = _front.getCargo();
      _size = 0;
      _front = _end = null;
      return holder;
    }
    else {
      D holder = _end.getCargo(); //Take the front cargo
      _end.getNext().setPrev(null); //Make the DLLNode behind it's front become null
      _end = _end.getNext(); //Make the DLLNode behind it the front
      _size--;
      return holder;
    }
  }//end pollLast()

  //Returns the last element of deque without removing
  public D peekLast() {
    return _end.getCargo();
  }//end peekLast()

  // toString method --> Prints out each DLLNode from first to last
  public String toString() {
    String retStr = "";
    DLLNode<D> temp = _front;
    for (int i = 0; i < _size; i++) {
      retStr = retStr + temp + " ";
      temp = temp.getPrev();
    }
    return retStr;
  }


  public static void main(String[] args) {

    Deque<String> bub = new QQKachoo<String>();

    System.out.println( "Adding to deque...\n" );
    bub.addFirst( "KoolAid" );
    bub.addLast( "Caprisun" );
    bub.addFirst( "Lunchables" );
    bub.addLast( "Oreos" );
    bub.addFirst( "Snickers") ;
    bub.addLast( "Skittles" );

    System.out.println( "New Deque: " );
    System.out.println( bub );

    System.out.println( "Size: " + bub.size() ); // 6
    System.out.println( "First Elem: " + bub.peekFirst() ); // Snickers
    System.out.println( "Last Elem: " + bub.peekLast() ); // Skittles

    System.out.println( "Remove First Elem: " + bub.pollFirst() ); // Snickers
    System.out.println( "Remove Last Elem: " + bub.pollLast() ); // Skittles
    System.out.println( "Remove Second Elem: " + bub.pollFirst() ); // Lunchables
    System.out.println( "Remove Fifth Elem: " + bub.pollLast() ); // Oreos

    System.out.println( "Size: " + bub.size());

    System.out.println( "New Deque: " );
    System.out.println( bub );

    System.out.println( "Removing the last two items...");
    System.out.println( "Remove First ElemL " + bub.pollFirst() );
    System.out.println( "Remove Last Elem: " + bub.pollLast() );
    System.out.println( "Is it empty? " + (bub.size() == 0));

  } // end main method

} // end class QQKachoo
