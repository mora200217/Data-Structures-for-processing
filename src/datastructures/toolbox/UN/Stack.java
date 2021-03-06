package datastructures.toolbox.UN;


import processing.core.*;

/**
 * Pila Array ( Stack )
 * 
 *  Estructura basada en arrays, 
 *  Consta de 1 array.
 */

interface StackGen<T> {
  abstract  public boolean empty();
  abstract  public boolean full();
  abstract public T pop();
  abstract public void push(T item);
}
public class Stack<T> implements  StackGen<T> {
  private static final int N= 10;
  private int numInside;
  private T[] arr;
  public Stack() {
    this(N);
  }
  
  @SuppressWarnings("unchecked")
public Stack(int N) {
    numInside = 0;
    arr =(T[]) new Object[N];
  }
  /**
   *  Retorna el objeto que está en top.
   *  Maneja Excepción de espacio.
   *  @param {}.
   *  @return{Type} - Éxito del proceso. 
   **/
  
  public T peek(){
  	if (empty()){
  		throw new RuntimeException("La pila está vacía");
  	}
  	return arr[numInside]
  }
  /**
   *  saca un elemento.
   *  Maneja Excepción de espacio.
   *  @param {}.
   *  @return{Type} - Éxito del proceso. 
   **/  
  public T pop() {
    if (empty()) {
      throw new RuntimeException("la pila esta vacia");
    }
    numInside--;
    return arr[numInside];
  }
  /**
   *  inserta un elemento.
   *  Maneja Excepción de espacio.
   *  @param {Type}.
   *  @return{} -Exito del proceso. 
   **/
  public void push(T item) {
    if (full()) {
      throw new RuntimeException("no hay espacio");
    }
    arr[numInside]=item;
    numInside++;
  }
  /**
   *  retorna si la pila esta llena o no.
   *  @param {}.
   *  @return{Boolean} -esta llena. 
   **/
  public boolean full() {
    return numInside >= arr.length;
  }
  /**
   *  retorna la cantidad de elementos en la cola.
   *  @param {}.
   *  @return{Intiger} -numero elementos en la cola. 
   **/
  public boolean empty() {
    return numInside <= 0;
  }
}