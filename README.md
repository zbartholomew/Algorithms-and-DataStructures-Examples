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

-- | get | containsKey | next | Notes
-- | -- | -- | -- | --
HashMap | O(1) | O(1) | O(h/n) | h is the table capacity
LinkedHashMap | O(1) | O(1) | O(1) 
IdentityHashMap | O(1) | O(1) | O(h/n) | h is the table capacity 
EnumMap | O(1) | O(1) | O(1) 
TreeMap | O(log n) | O(log n) | O(log n) 
ConcurrentHashMap | O(1) | O(1) | O(h/n) | h is the table capacity 
ConcurrentSkipListMap | O(log n) | O(log n) | O(1)

-- | offer | peek | poll | size
-- | -- | -- | -- | --
PriorityQueue | O(log n) | O(1) | O(log n) | O(1)
ConcurrentLinkedQueue | O(1) | O(1) | O(1) | O(n)
ArrayBlockingQueue | O(1) | O(1) | O(1) | O(1)
LinkedBlockingQueue | O(1) | O(1) | O(1) | O(1)
PriorityBlockingQueue | O(log n) | O(1) | O(log n) | O(1)
DelayQueue | O(log n) | O(1) | O(log n) | O(1)
LinkedList | O(1) | O(1) | O(1) | O(1)
ArrayDeque | O(1) | O(1) | O(1) | O(1)
LinkedBlockingDeque | O(1) | O(1) |  O(1) | O(1)

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
      
## Binary Tree
  - A tree data structure in which each node has at most two children, which are referred to as the left child and the right child.
  - A recursive definition using just set theory notions is that a (non-empty) binary tree is a triple (L, S, R), where L and R are
    binary trees or the empty set and S is a singleton set.
  - Types of Binary Trees:
    - rooted 
    - full 
    - perfect 
    - complete 
    - infinite complete
    - balanced
    - degenerate 
  - Common Operations:
    - Insertion
    - Deletion
    - Traversal
  - You can search and insert / delete items quickly in a tree
  - Ordered Arrays are bad at Insertions / Deletions
  - Finding items in a Linked List is slow
  - Time needed to preform an operation on a tree is O(log n)
  - On average a tree is more efficient if you need to perform many different types of operations.
  
## Heap
  -  Is a specialized tree-based data structure that satisfies the heap property: if P is a parent node of C, then the key (the value) of node P is greater than the key of node C.
  - A heap can be classified further as either a "max heap" or a "min heap".
    - In a max heap, the keys of parent nodes are always greater than or equal to those of the children and the highest key is in the root node.
    - In a min heap, the keys of parent nodes are less than or equal to those of the children and the lowest key is in the root node.
  - The heap is one maximally efficient implementation of an abstract data type called a priority queue, and in fact priority queues are often referred to as "heaps", regardless of how they may be implemented.
  -  A common implementation of a heap is the binary heap, in which the tree is a complete binary tree (see figure).
  ![heap](https://user-images.githubusercontent.com/16873263/27721625-5d5b654e-5d16-11e7-9572-764abc4ee36e.png)
  
## Trie
  - A trie, also called digital tree and sometimes radix tree or prefix tree (as they can be searched by prefixes), is a kind of search tree—an ordered tree data structure that is used to store a dynamic set or associative array where the keys are usually strings.
  - Unlike a binary search tree, no node in the tree stores the key associated with that node; instead, its position in the tree defines the key with which it is associated. 
  - All the descendants of a node have a common prefix of the string associated with that node, and the root is associated with the empty string. 
  - Values are not necessarily associated with every node. 
    - Rather, values tend only to be associated with leaves, and with some inner nodes that correspond to keys of interest.
  - As a replacement for other data structures
    - As discussed below, a trie has a number of advantages over binary search trees.
    - A trie can also be used to replace a hash table, over which it has the following advantages:
      - Looking up data in a trie is faster in the worst case, O(m) time (where m is the length of a search string), compared to an imperfect hash table. An imperfect hash table can have key collisions. A key collision is the hash function mapping of different keys to the same position in a hash table. The worst-case lookup speed in an imperfect hash table is O(N) time, but far more typically is O(1), with O(m) time spent evaluating the hash.
      - There are no collisions of different keys in a trie.
      - Buckets in a trie, which are analogous to hash table buckets that store key collisions, are necessary only if a single key is associated with more than one value.
      - There is no need to provide a hash function or to change hash functions as more keys are added to a trie.
      - A trie can provide an alphabetical ordering of the entries by key.
    - Tries do have some drawbacks as well:
      - Tries can be slower in some cases than hash tables for looking up data, especially if the data is directly accessed on a hard disk drive or some other secondary storage device where the random-access time is high compared to main memory.
      - Some keys, such as floating point numbers, can lead to long chains and prefixes that are not particularly meaningful.
      - Nevertheless, a bitwise trie can handle standard IEEE single and double format floating point numbers.
      - Some tries can require more space than a hash table, as memory may be allocated for each character in the search string, rather than a single chunk of memory for the whole entry, as in most hash tables.
      
  - In the example shown, keys are listed in the nodes and values below them. 
  - Each complete English word has an arbitrary integer value associated with it. 
  - A trie can be seen as a tree-shaped deterministic finite automaton. 
  - Each finite language is generated by a trie automaton, and each trie can be compressed into a deterministic acyclic finite state automaton.
  
  ![trie_example](https://user-images.githubusercontent.com/16873263/27943379-90c7783c-6293-11e7-9231-e0ce8b15f889.png)

## Graph
  - A Graph is an abstract data type that is meant to implement the undirected graph and directed graph concepts from mathematics, specifically the field of graph theory.
  - Different data structures for the representation of graphs are used in practice:
    - Adjacency list
      - Vertices are stored as records or objects, and every vertex stores a list of adjacent vertices. This data structure allows the storage of additional data on the vertices. Additional data can be stored if edges are also stored as objects, in which case each vertex stores its incident edges and each edge stores its incident vertices.
    - Adjacency matrix
      - A two-dimensional matrix, in which the rows represent source vertices and columns represent destination vertices. Data on edges and vertices must be stored externally. Only the cost for one edge can be stored between each pair of vertices.
    - Incidence matrix
      - A two-dimensional Boolean matrix, in which the rows represent the vertices and columns represent the edges. The entries indicate whether the vertex at a row is incident to the edge at a column.

![directedgraph](https://user-images.githubusercontent.com/16873263/28236725-7972acc4-68e2-11e7-9a59-72a97c955a52.png)
      
  - Graph Traversal algorithms
    - Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. 
      - One starts at the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along each branch before backtracking.
      - Worst-case performance	O(|V|+|E|) for explicit graphs traversed without repetition, O(b^d) for implicit graphs with branching factor b searched to depth d
      - Worst-case space complexity	O(|V|) if entire graph is traversed without repetition, O(longest path length searched) for implicit graphs without elimination of duplicate nodes
      - The non-recursive implementation is similar to breadth-first search but differs from it in two ways:
        - it uses a stack instead of a queue, and
        - it delays checking whether a vertex has been discovered until the vertex is popped from the stack rather than making this check before adding the vertex.
    - Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. 
      - It starts at the tree root (or some arbitrary node of a graph, sometimes referred to as a 'search key') and explores the neighbor nodes first, before moving to the next level neighbors.
      - Worst-case performance	O(|V|+|E|)= O(b^d)
      - Worst-case space complexity	O(|V|)=O(b^d)
      - This non-recursive implementation is similar to the non-recursive implementation of depth-first search, but differs from it in two ways: 
        - it uses a queue (First In First Out) instead of a stack and 
        - it checks whether a vertex has been discovered before enqueueing the vertex rather than delaying this check until the vertex is dequeued from the queue.
