/*****************************************************
 * class DLLNode v1
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode<D>
{
    private D _cargo;    //Generic Typed Cargo
    private DLLNode<D> _nextNode, _prevNode; //pointers to next, prev DLLNodes


    // constructor -- initializes instance vars
    public DLLNode( D value, DLLNode<D> prev, DLLNode<D> next )
    {
	_cargo = value;
	_nextNode = next;
	_prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public D getCargo() { return _cargo; }

    public DLLNode<D> getNext() { return _nextNode; }

    public DLLNode<D> getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public D setCargo( D newCargo )
    {
	D foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode<D> setNext( DLLNode<D> newNext )
    {
	DLLNode<D> foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public DLLNode<D> setPrev( DLLNode<D> newPrev )
    {
	DLLNode<D> foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


}//end class


