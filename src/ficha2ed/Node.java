/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ed;

/**
 *
 * @author tiago
 */
public class Node<T> {
    private Node<T> next;
    private T element;

    public Node(T element) {
        this.element = element;
    }

    public Node() {
        this.next = null;
        this.element = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    
    
    
    
    
    
}
