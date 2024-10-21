# Linked List Cycle Detection Solution

## How did I approach this task?

To detect a cycle in a linked list, I implemented **Floyd's Cycle Detection Algorithm** (also known as the Tortoise and Hare algorithm). 

Steps:
1. **Two pointers**: I used two pointers, `slow` and `fast`. The `slow` pointer moves one step at a time, while the `fast` pointer moves two steps at a time.
2. **Cycle detection**: If a cycle exists, the fast pointer will eventually meet the slow pointer within the cycle.
3. **Finding the cycle start**: Once a cycle is detected, I reset one pointer to the head of the list and move both pointers one step at a time.
4.  The point where they meet is the start of the cycle.

## Challenges I faced

The main challenge was efficiently detecting and finding the start of the cycle in the linked list. Managing two pointers to navigate 
the cycle and ensure that the start node is correctly identified required careful tracking of pointers.
