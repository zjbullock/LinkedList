package org.linkedlist.practice.singly;

import lombok.Getter;
import lombok.Setter;
import org.linkedlist.practice.doubly.DoublyLinkedNode;
import org.linkedlist.practice.entities.ASIDMethods;
import org.linkedlist.practice.entities.Node;

@Getter
@Setter
public class SinglyLinkedNode extends Node implements ASIDMethods {
    //**********************DON'T TOUCH**********************
    private SinglyLinkedNode nextchild;

    public SinglyLinkedNode(String letter, SinglyLinkedNode child) {
        super(letter);
        this.nextchild = child;
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
        if (this.nextchild != null) {
            this.nextchild.appendNode(letter);
        }
        this.nextchild = new SinglyLinkedNode(letter, null);
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
