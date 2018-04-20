# GreenTomatoes
##### Brian Lin, Thet Htay Zaw, Brandon Chong  

# Description 
Our underlying container for Deque will be Nodes because most of their methods provide similar functionality as Deque methods. 
We chose to use poll() and peek() instead of remove() and get() because the first two returns null. In our homeworks, we have been returning null values instead of throwing Exceptions. We are going to follow this thread for this lab. If we have time towards the end of our lab, we still consider adding in remove() and get(). Although it is not in the API, we will also consider a isEmpty() method. 

We are considering either the use of LLNode() or DLLNode(). Although our thought process isn't completely fleshed out for this right now, we believe that DLLNode() could let us keep constant runtime for the add() and poll() methods as we get use both get/setPrev() and get/setNext(). 

Final decisions: We're using DLLNodes for our deque. This is because having access to the values on both sides of an element will let us have constant runtime poll() and add() methods. We can not limited in the way singly linked nodes are because instead of iterating through the nodes to find the value to the back of a node, we are able to just use getPrev(). If we had used singly linked nodes, we would have some linear run time methods. 
</br>
In addition, we will not be having a max capacity because we do not see a need for one. And as a result of that, we will not be including the offer() methods. As offer() will always return true due to our lack of a maximum capacity, we do not believe that it adds a lot of value to us. 

# Instance Variables 
- _size <br />
- _front <br />
- _end 
  
# New Methods List
 **( Chose not to do methods in 0. because they are unnecessary to our Deque class's functionality)** 
  <br\> 0. offerLast() / contains() / remove() / get() / removeFirstOccurance() / removeLastOccurance() / iterator() 
  **============================================================================** 
  1.  addLast() <br/> 
  2.  pollFirst() <br/>
  3.  peekFirst() <br/>
  4.  size() <br/>
  These 4 methods come first so we have a regular queue first. 
  **============================================================================** 
  5. addFirst()  <br/>
  6. pollLast()  <br/>
  7. peekLast()  <br/>
  These methods let us add to the front of the deque and remove from the end. Which basically starts making this double ended. Also peekLast() comes hand in hand with pollLast(). If we do add a isEmpty(), it will go on this line too. <br/> <br/>
   With these methods, we have a basic 'deque' / double ended queue. Anything after is "extra" in the sense that we have not been working with them with our previous queues, but the methods could be helpful when using this data set. We may not be able to get to the methods below too. <br/>
   **---------------------------------------^^^^Finished!!!^^^^----------------------------------------------------**
  
# Plan
  1. ~~Create interface Deque and copy all methods from Priority List into interface~~
  2. ~~Create class QQKachoo~~
  3. ~~Write each method from Priority List one by one, left-most method first~~
  4. ~~Once compilable, use KtS and forge a variety of test cases to use in QQKachoo~~
  5. ~~Add comments to clarify and beautify code~~
  6. Voila!
