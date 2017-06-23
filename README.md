# Algorithms-and-DataStructures-Examples

## Complexity Resource
  - http://bigocheatsheet.com/

## Java Complexity
--| get |  add | contains | next | remove(0) | iterator.remove
-- | -- | -- | -- | -- | -- | -- 
| ArrayList | O(1) | O(1) | O(n) | O(1) | O(n) | O(n)
LinkedList | O(n) | O(1) | O(n) | O(1) | O(1) | O(1)
CopyOnWrite-ArrayList | O(1) | O(n) | O(n) | O(1) | O(n) | O(n)

-- | add | contains | next | notes
-- | -- | -- | -- | --
HashSet | O(1) | O(1) | O(h/n) | h is the table capacity
LinkedHashSet | O(1) | O(1) | O(1) 
CopyOnWriteArraySet | O(n) | O(n) | O(1) 
EnumSet | O(1) | O(1) | O(1) 
TreeSet | O(log n) | O(log n) | O(log n)
ConcurrentSkipListSet | O(log n) | O(log n) | O(1)

## Array
  - Contains examples of the array structure, as well as,
    - Binary Search
    - Bubble Sort
    - Insertion Sort
    - Selection Sort
    
## Stacks
  - A stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle. 
  - In the pushdown stacks only two operations are allowed: push the item into the stack, and pop the item out of the stack. 
  - A stack is a limited access data structure - elements can be added and removed from the stack only at the top. push adds an item to
    the top of the stack, pop removes the item from the top.
  - A helpful analogy is to think of a stack of books; you can remove only the top book, also you can add a new book on the top.
  - A stack is a recursive data structure. Here is a structural definition of a Stack:
    - a stack is either empty or
    - it consistes of a top and the rest which is a stack;
  - The simplest application of a stack is to reverse a word. You push a given word to stack - letter by letter - and then pop letters
    from the stack.
  - Another application is an "undo" mechanism in text editors; this operation is accomplished by keeping all text changes in a stack.
  - Application:
    - **Deapth-First Search with a Stack**
      - In depth-first search we go down a path until we get to a dead end; then we backtrack or back up (by popping a stack) to get an
        alternative path.
          - Create a stack
          - Create a new choice point
          - Push the choice point onto the stack
          - while (not found and stack is not empty)
          - Pop the stack
          - Find all possible choices after the last one tried
          - Push these choices onto the stack
          - Return
  
## Queues
  - A queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO)
    principle.
  - New additions to a line made to the back of the queue, while removal (or serving) happens in the front. 
  - In the queue only two operations are allowed enqueue and dequeue
  - Enqueue means to insert an item into the back of the queue, dequeue means removing the front item. The picture demonstrates the FIFO
    access.
  - The difference between stacks and queues is in removing.
    - In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.
  - Application:
    - **Breadth-First Search with a Queue**
      - In breadth-first search we explore all the nearest possibilities by finding all possible successors and enqueue them to a queue.
        - Create a queue
        - Create a new choice point
        - Enqueue the choice point onto the queue
        - while (not found and queue is not empty)
        - Dequeue the queue
        - Find all possible choices after the last one tried
        - Enqueue these choices onto the queue
        - Return
  
## Linked List
  - Is a linear collection of data elements, called nodes, each pointing to the next node by means of a pointer.
  - Advantages:
    - Linked lists are a dynamic data structure, which can grow and be pruned, allocating and deallocating memory while the program is
      running.
    - Insertion and deletion node operations are easily implemented in a linked list.
    - Dynamic data structures such as stacks and queues can be implemented using a linked list.
    - There is no need to define an initial size for a linked list.
    - Items can be added or removed from the middle of list.
    - Backtracking is possible in two way linked list.
  - Disadvantages
    - They use more memory than arrays because of the storage used by their pointers.
    - Nodes in a linked list must be read in order from the beginning as linked lists are inherently sequential access.
    - Nodes are stored incontiguously, greatly increasing the time required to access individual elements within the list, especially
      with a CPU cache.
    - Difficulties arise in linked lists when it comes to reverse traversing. For instance, singly linked lists are cumbersome to
      navigate backwards and while doubly linked lists are somewhat easier to read, memory is consumed in allocating space for a back
      pointer.
  - Singly linked list
    - Singly linked lists contain nodes which have a data field as well as a 'next' field, which points to the next node in line of
      nodes.
    - Operations that can be performed on singly linked lists include insertion, deletion and traversal.
  - Doubly linked list
    - In a 'doubly linked list', each node contains, besides the next-node link, a second link field pointing to the 'previous' node in
      the sequence. 
    - The two links may be called 'forward('s') and 'backwards', or 'next' and 'prev'('previous').
  - Circular Linked list
    - In the last node of a list, the link field often contains a null reference, a special value used to indicate the lack of further
      nodes.
    - A less common convention is to make it point to the first node of the list; in that case the list is said to be 'circular' or
      'circularly linked'; otherwise it is said to be 'open' or 'linear'.
  
