# Chapter 3 - Stacks and Queues

1. Use a single array to implement 3 stacks

2. Design a stack that has O(1) push, pop and min functions

3. Imagine a (literal) stack of plates. If the stack gets too high,
it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold.
Implement a data structure SetOfStacks that mimics this.
SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity.
SetOfStacks.push() and SetOfStacks. pop () should behave identically to a single stack (that is, pop () should return the same values as it would if there were just a single stack).

 FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.

4. Implement a MyQueue class which implements a queue using two stacks.

5. Write a program to sort a stack such that the smallest items are on the top.
You may use at most one additional stack to hold items, but you may not copy the elements into any other data structure (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.

6. An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the built-in LinkedList data structure.
