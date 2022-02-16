//Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
//
//Implement the LRUCache class:
//
//LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
//int get(int key) Return the value of the key if the key exists, otherwise return -1.
//void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
//The functions get and put must each run in O(1) average time complexity.

import java.util.HashMap;
import java.util.Map;

class LRUCache_146 {

    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> node_map;//HashMap
    int cache_capacity;

    public LRUCache_146(int capacity) {
        node_map = new HashMap(capacity);
        this.cache_capacity = capacity;
        head.next = tail;//Connecting head and tail
        tail.prev = head;
    }

    public int get(int key) {

        int result = -1;
        Node node = node_map.get(key);

        if(node != null){
            result = node.value;
            remove(node);
            add(node);
        }

        return result;
    }

    public void put(int key, int value) {

        Node node = node_map.get(key);

        if(node != null){
            node.value = value;
            remove(node);
            add(node);
        }

        else{

            if(node_map.size() == cache_capacity){
                node_map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node new_node = new Node();
            new_node.key = key;
            new_node.value = value;

            node_map.put(key, new_node);
            add(new_node);
        }
    }

    public void add(Node node){
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;

        next_node.prev = prev_node;
        prev_node.next = next_node;
    }

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */