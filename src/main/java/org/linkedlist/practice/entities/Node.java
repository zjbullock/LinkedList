package org.linkedlist.practice.entities;

public abstract class Node {
    protected String letter;
    protected Node node;

    public Node(String letter, Node node) {
        this.letter = letter;
        this.node = node;
    }
}
