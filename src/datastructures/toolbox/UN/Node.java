package datastructures.toolbox.UN;

class Node<T> {
	  public T value; 
	  Node<T> next; 
	  Node<T> prev; 

	  public Node(T value) {
	    this.value = value;
	  }

	  public  Node() {
	    this.value = null;
	  }

	  public void setNext(Node<T> newRef) {
	    this.next = newRef;
	  }

	  public Node<T> getNext() {
	    return this.next;
	  }

	  public void setPrev(Node<T> newPrev) {
	    this.prev = newPrev;
	  }

	  public Node<T> getPrev() {
	    return this.prev;
	  }
	}