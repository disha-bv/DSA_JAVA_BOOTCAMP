# Day2
# Function in java 
## Type of function
- In-built function : nextInt() , length()  
 - User defined function : 
1. function with return and without parameter
2. function with return and with parameter
3. function without return and with parameter
4. function without return and without parameter
# Recursion
- A function calling itself 
- it uses base case and recursive case
## Types of recursion
  1. Direct recursion : function calling by itself directly
  2. Indirect recursion :two or more functions call each other in a cycle instead of a function calling itself directly.
  3. Tree recursion : A function makes 2 or more recursive calls , form a tree like structure 
  4. Nested recursion : McCarthy91 , recursively call as an argument to another call of same function 
  5. Tail recursion : recursive call happen at last
  6. Head recursion : recursive call happens after processing current node

# Call stack 
- Used for storing calls of function and return the value
- push() and pop()
- calls stack in memory

# Class
- Blueprint of an Object
- It is a User-defined datatype
- can call in both inside and outside main class
- Abstract class , Default class , Final are classes which are called outside main Class( class can not be public)
- instance of the class created using "new" constructor (object initialization can be done)
 
 # objects
- Instance of the class 

# Constructor
- Used to initialize the objects and refers to the class
- No return value 
   ## Types
   - Default
   - Parameterized
   - Non-Parameterized
   - Copy constructor : can take parameter as instance
   - Private constructor : prevents direct object creation from outside the class
## Constructor Chaining
- can be done in 2 ways 
1. Same class : this()
2. Different class : super()
# OOPS
 ## Encapsulation
 - Wraps data and functions(sending private data)
 - Class is the best example
 1. Getters: read/access the value of a private variable (User-defined function)
 2. Setters : modify/change the value of a private variable
 - Variables : container which stores the value 
  1. class variable : Private variables which are accessed inside the class
  2. local variable : Accessing inside the method of the class
  3. Instance variable : creating a data inside the class ,  outside method(function) of the class 
  4. Static variable : Eliminates the instance of the class
- Attribute: Providing characteristics to the variable 
 ## Polymorphism
 - one name or method can have multiple forms or behaviors depending on the situation.
 - Upcasting: converting a child class reference into a parent class reference.
 - Downcasting : converting a parent class reference back into a child class reference.
 - Types
 1. Compile time polymorphism(method overloading(same function with different parameters))
 2. Runtime polymorphism(method overriding(function with same name and different parameters))
 ## inheritance
 - Parent-child relationship
 - Types
 1. Single-level
 2. Multi-level
 3. Hybrid : Combination of 2 or more inheritance
 3. Hierarchical
 ## Abstraction
 - Hiding the extra info and displaying the main info
 - complete abstraction can be done using interfaces
 - Abstract classes(80%) and interfaces(100%) are the main methods
 - Interfaces : Blueprint for the class . whatever the declaration is done , it must be in class
 - Interface created inside the class is called Nested interface
 - Static , private , Default , Abstract are the methods/interfaces used for abstraction
 - Functional Interface -



 # DAY-3
 
 ## Static
 - member belongs to the class, not to individual objects.
 - Types
 1. Static Method : call function without creating the instance
 2. Static variable : Variables assigned after allocating the class memory
 3. Static block
 - belongs to class based memory but not to methods
 - Memory allocation is in class area 

 ## FinalKeyword
 - immutable in nature
 - No extension after final
 - Type
 1. final class
 2. final variable
 3. final method
 4. finally
 5. finalize
  
  ## Exception handling
  - Exception
  1. checked Exception
  2. Unchecked Exception
  3. compile-time Exception
  4. custom Exception


# DAY4
## Array
- collection of similar Datatypes
- Can store pointers
- Can store order in Hexadecimal format
- Have contiguous storing of values
- Jagged Array - every row consist of different number of columns
## collections in Java / Java Generic Classes
- Interface -> Classes -> Objects 
  ### Interface in java
  1. List :
  - interface which stores ordered collection of element but Dynamic
  - Allows Duplicate and null
  Supports index based access
  Index starts from 0
  -  Classes -> - ArrayList 
                - LinkedList 
                - Vector 
                    -Stack
  2. Set:
  - collection of unique elements
  - classes -> - HashSet : does not allows duplicates
               - LinkedHashSet
               - SortedSet
  3. Queue :
  - offer and pole are the operations in java
  - classes -> - PriorityQueue
               - Deque
                  - ArrayDeque
  4. Map :
  - 
  - Classes ->- HashMap
              - LinkedHashMap
              -SortedMap
                -NavigableMap
                -TreeMap
              - HashTable
              - ConcurrencyHashMap
## Lambda Expressions
- Short way of writing a function which take less time to execute(shortcut)
- No name 
- Anonymous expression
- Used for functional interfaces
-Types
1. No parameter lambda
2. single parameter lambda
3. Multi parameter lambda
4. Multi Parameter with return
5. Multi line block Lambda


# DAY5
## homework : 
- Binary leetcode 35 , 704 
- Greedy leetcode 1306 , 55 , 45 , 135 , 134 
## Company specific:
- leetcode 410 , 1283 , 1552 , 1482
## tripillar:
- leetcode 9 , 13 , 66 , 258 , 326 , 342 , 367(using binary search) , 904

## Exception handling 
- process of detecting and responding to errors that occur while a program is running, so the program can recover gracefully instead of crashing.
### types
1. Checked exception(compile-time) : IOException , FileNotFound , SQLException , ClassNotFoundException
- Checked by compiler
- Must handle using try and catch block
- External conditions are responsible
- Occurs in both runtime and compile time executions 
- Throws is required 
2. Unchecked exception(run-time) : ZeroDivisionError(ArithematicException) , ArrayIndexOutOfBounds , NullPointerException , NumberFormatException 
- Throws is not necessary
3. Custom exception : Created by users 
- When u r creating a class of exception which is user defined .
#### types of custom exception
- checked custom exception 
- unchecked custom exception
### Key words
- try , catch , finally , throw(declared line)(uses constructor in class name) , throws(function)(uses class name)


# DAY6
## Sliding window Maximum
## Depth-first search
- Visualization occurs through recursion
- Some problems can solve using 2 pointer technique




# DAY7
## Dynamic Programming
- Process of converting big problem into smaller overlapping subproblem and storing data in the result . 
- these problems will have n+1 solutions/values
- Dp will have solution for every problems
- do nothing is also an operation {}=1
- Follows the process of Tabulation 
### Types 
1. Tabulation ( Bottom-up approach) : solves smaller sub problems 1st and iteratively builds up to final solution 
- Uses for loop
- Stores in table
- Iterate and store data
2. Memoization( top-down approach): write the problem recursively and stores results in a table before returning them
- using recursion call stack popped values

## Backtracking
- Revisiting the previous call if there is no further 
- Choose->Explore->Undo->Try Another choice

# DAY8

## Longest common subsequence(LCS)
- Length of the common values of 2 strings .
  eg: s1 = abcda , s2 = abda , LCS : abda (value : 4)
- this is the kind of 2D Dp
- LCS between 2 null String is Zero
- LCS value is zero even if 1 string is null
## Time and Space complexity
1. Time Complexity : 
- Number of operations grows as input size grows
- O (Big O) Notation
### Notation 
- O(1) -> Constant
- O(log N) -> Logarithmic (>10^9)  -> Binary
- O(n) -> Linear
- O(n^2)-> Quadratic
- O(2^n)-> Exponential
- O(n log N)-> Linear Logarithmic -> Sorting

2. Space Complexity:
- Additional space used as input values increased.

## Sorting
### Types of sort
1. Bubble sort
2. Insertion sort
3. Merge sort 
4. Quick sort
5. Bucket sort
6. Radix sort
7. Heap sort
8. Counting sort
9. Selection sort

## Bit Manipulation
- Visualizing numbers in terms of bits
- Using ^ , >>,<<, & ,| ,!

# DAY9
## Strings in java
- It is a class
- Immutable
- String s;
- String constant pool stores same values when the variables are pointing to same pool . Hence , they are immutable
- String can be mutable when we use String builder(is for single thread code)(insert(),append(),delete(),replace(),reverse()) and string buffer
- String Buffer : Safer option for multi thread code
- Slower than builder
- String literals are maintained in a pool
- New string() stores in heap/new object
- == compares the object 
- equals() compares values

### String creation
1. String class
2. String literals

## LinkedList
- linear data structure where elements are stored in nodes.
### types
1. singly linked list
2. doubly linked list
3. circular list
4. double ended queue
5. double ended circular queue

// take an array with value 1,2,3,4,5,6 add all the values to the queue . take k values from range of size of queue and add 1st k values to the stack  

# DAY10
## Trees
- collection of nodes connected by edges 
- Follows Hierarchical structure
- Non-Linear data structure
### Tree Terminologies :
1. Node :Element which stores Data item
2. Edge : Connection between 2 nodes
3. Root : Top most Node
4. Parent Node: A node that have child nodes 
5. Child Node : A node connected below a node 
6. Sibling : Node having same parent 
7. Leaf node : Last node of the tree
8. Internal node : Non-leaf nodes 
9. Subtree : Tree inside a tree which has data items
10. Degree of node : Number of child node connected to parent node 
11. Degree of a tree : Maximum degree of a node in a tree 
12. Path : Sequence through edges
13. Depth of a node : Number of edges starting from root node towards particular node
14. Height of node :longest edges connected to particular node
15. Height of tree : Number of edges starting from root node towards leaf node
16. Level : The number of edges in the path from the root to that node
17. Forest : group of trees
18. Depth of a tree : Number of edges starting from root node towards leaf node


### Types
1. Normal Tree : Non-Linear collection of nodes connected by edges
2. Binary Tree : tree which can not have more than 2 child nodes(can have 0,1,2)(left node < root node < right node)
#### types of binary tree
1. Full Binary Tree : Should have either 0 or 2 child nodes
2. Complete Binary Tree : Every values are filled can have one left insertion
3. Perfect Binary Tree : Every level consist of 2 children
4. Balanced Binary Tree:
- AVL tree : self balanced tree
- Red Black tree
5. Skewed Binary tree :
- Left Skewed tree : tree having left nodes
- Right Skewed tree : tree having right nodes
6. Binary Search tree : Type of Binary tree itself
- AVL : Height of left - Height of right = Factor
7. Trie : Used for string manipulation(Prefix string storing)

### operations of binary tree
1. Insertion:
   - BFS
   - DFS
2. Search
   - BFS
   - DFS
3. Traversal
   - InOrder
   - PreOrder
   - PostOrder


# DAY12
## Graphs

