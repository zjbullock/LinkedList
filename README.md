# **Linked List**

_The desired order in which you should work through these lessons is first singly, then doubly, and finally circular._

LinkedLists are one of the most important and basic data structures.  

The basics of a LinkedList is that it consists of nodes that are linked together via pointers to the next node.
Traversal must happen via recursion, in other words, calling a method within itself until you find some desired result.

Recursive Methods look something like the below:

```
Assuming your class looks like:

Public class org.linkedlist.practice.entities.Node {
    private String letter;
    private org.linkedlist.practice.entities.Node child;
    
    public org.linkedlist.practice.entities.Node(String letter, org.linkedlist.practice.entities.Node child) {
        this.letter = letter;
        this.child = child;
    }
      
}

To get access to the child node and subquent nodes for a specific letter, your function might look something like:

public org.linkedlist.practice.entities.Node searchForNodeWithLetter(org.linkedlist.practice.entities.Node node, String letter) {
    if (node.letter.equalsIgnoreCase(letter)) {
        return node;
    }
    return searchForNodeWithLetter(node.child, letter);
}
```

Notice, the defined method continues to call itself until it reaches 

Insertion and Deletion in LinkedList are fast; however, both the searching and access time of a LinkedList are fairly slow.


Linked Lists could be seen as a potential list solution if any of the criteria are met:

1.  Constant time is a necessity for insertions and deletions in a list.

2.  Random access isn't necessary (Think index lookup in an array)

3.  You want to be able to insert items anywhere in the list

4.  You're not sure how many items will be in the list.
