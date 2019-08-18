package com.japps.collections;

/**
 * NavigableSet represents a navigable set in Java Collection Framework. The NavigableSet interface inherits from the SortedSet interface. It behaves like a SortedSet with the exception that we have navigation methods available in addition to the sorting mechanisms of the SortedSet. For example, NavigableSet interface can navigate the set in reverse order compared to the order defined in SortedSet.

The classes that implement this interface are, TreeSet and ConcurrentSkipListSet

Methods of NavigableSet (Not in SortedSet):

Lower(E e) : Returns the greatest element in this set which is less than the given element or NULL if there is no such element.
Floor(E e ) : Returns the greatest element in this set which is less than or equal to given element or NULL if there is no such element.
Ceiling(E e) : Returns the least element in this set which is greater than or equal to given element or NULL if there is no such element.
Higher(E e) : Returns the least element in this set which is greater than the given element or NULL if there is no such element.
pollFirst() : Retrieve and remove the first least element. Or return null if there is no such element.
pollLast() : Retrieve and remove the last highest element. Or return null if there is no such element.
 */

public class NavigationalSetDemo {

}
