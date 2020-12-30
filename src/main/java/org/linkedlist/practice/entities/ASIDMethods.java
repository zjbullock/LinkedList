package org.linkedlist.practice.entities;

public interface ASIDMethods {
    /**
     * Should access a String value and return it
     * @param letter
     * @return
     */
    abstract String accessNodeByLetter(String letter);

    /**
     * Should return a Node that has the given letter.
     * @param letter
     * @return
     */
    abstract Node searchForNodeWithLetter(String letter);

    /**
     * Should insert a new node with the provided letter onto the last node
     * and also set the child node to the point to the previous child if there is one.
     * @param letter
     */
    abstract void appendNode(String letter);

    /**
     * Should insert a new new node with the provided letter onto the front of the list.
     * @param letter
     */
    abstract void pushNode(String letter);

    /**
     * Should insert a new node after a provided node.  The new node should point to the now disconnected node.
     * @param previousNode
     * @param letter
     */
    abstract void insertNodeAfter(Node previousNode, String letter);

    /**
     * Should delete the child node, and make the next node this node's child if there is one.
     * @param letter
     */
    abstract void deleteNode(String letter);

    /**
     * Should print all letters in the list, with a comma and space between letters.  Ex:  A, B, C, D, E, etc.
     * If there are no letters in the list, it should state "List is empty!"
     */
    abstract void printList();
}

