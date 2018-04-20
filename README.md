# GreenTomatoes
##### Brian Lin, Thet Htay Zaw, Brandon Chong  

# Description 
Our underlying container for Deque will be Nodes because most of their methods provide similar functionality as Deque methods. 
We chose to use poll() and peek() instead of remove() and get() because the first two returns null. In our homeworks, we have been returning null values instead of throwing Exceptions. We are going to follow this thread for this lab. If we have time towards the end of our lab, we still consider adding in remove() and get(). Although it is not in the API, we will also consider a isEmpty() method. 

We are considering either the use of LLNode() or DLLNode(). Although our thought process isn't completely fleshed out for this right now, we believe that DLLNode() could let us keep constant runtime for the add() and poll() methods as we get use both get/setPrev() and get/setNext(). 

Final decision: We're using DLLNodes
# Instance Variables 
- _size <br />
- _front <br />
- _end 
  
# Deque Methods Priority List
  1.  addLast() / pollFirst()
  2.  peekFirst() / size() <br/>
  These methods come first so we have a regular queue first. 
  -----------------^^^^Currently finished up to^^^^----------------------------------------------------
  3.  offerLast()  <br/> 
  We chose to have implemenet offerLast() here because it wouldn't take too much time and the boolean could be helpful as we continue one. <br/> 
  Now we start the methods that make this queue a 'deque'
  4. addFirst() / pollLast() / peekLast() / offerFirst() <br/>
  This lets us add to the front of the deque and remove from the end. Which basically starts making this double ended. Also peekLast() comes hand in hand with pollLast(). If we do add a isEmpty(), it will go on this line too. <br/> <br/>
   With these methods, we have a basic 'deque' / double ended queue. Anything after is "extra" in the sense that we have not been working with them with our previous queues, but the methods could be helpful when using this data set. We may not be able to get to the methods below too. <br/>
  5. contains() / remove() / get() 
  6. removeFirstOccurance() / removeLastOccurance() / iterator() 
  
# Plan
  1. Create interface Deque and copy all methods from Priority List into interface
  2. Create class QQKachoo
  3. Write each method from Priority List one by one, left-most method first
  4. Once compilable, use KtS and forge a variety of test cases to use in QQKachoo 
  5. Add comments to clarify and beautify code
  6. Voila!
