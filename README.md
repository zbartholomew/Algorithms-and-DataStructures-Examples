# Algorithms-and-DataStructures-Examples

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
  
  
  
