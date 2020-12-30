package org.linkedlist.practice.doubly;

import lombok.Getter;
import lombok.Setter;
import org.linkedlist.practice.entities.ASIDMethods;
import org.linkedlist.practice.entities.Node;

@Getter
@Setter
public class DoublyLinkedNode extends Node implements ASIDMethods {

    //**********************DON'T TOUCH**********************
    private DoublyLinkedNode previousChild;

    public DoublyLinkedNode(String letter, DoublyLinkedNode nextChild, DoublyLinkedNode previousChild) {
        super(letter, nextChild);
        this.previousChild = previousChild;
    }
    //**********************DON'T TOUCH**********************

    @Override
    public String accessNodeByLetter(String letter) {
        return null;
    }

    @Override
    public Node searchForNodeWithLetter(String letter) {
        return null;
    }

    @Override
    public void appendNode(String letter) {

    }

    @Override
    public void pushNode(String letter) {

    }

    @Override
    public void insertNodeAfter(Node previousNode, String letter) {

    }

    @Override
    public void deleteNode(String letter) {

    }

    @Override
    public void printList() {

    }
}
