package org.linkedlist.practice.circular;

import lombok.Getter;
import lombok.Setter;
import org.linkedlist.practice.entities.ASIDMethods;
import org.linkedlist.practice.entities.Node;

@Getter
@Setter
public class CircularlyLinkedNode extends Node implements ASIDMethods {

    //**********************DON'T TOUCH**********************
    public CircularlyLinkedNode(String letter, Node node) { super(letter, node); }
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
