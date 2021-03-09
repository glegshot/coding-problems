package org.challenges.ctci;

/**
 * This is a custom implementation of hashtable
 * to demonstrate and understand the same
 * <p>
 * This implementation only support a fixed length table
 * and provides only insert(key,value) and get value operations
 * <p>
 * This is not a synchronized data structure.
 * <p>
 * Heavily inspired by the original HashTable of JDK
 */

public class CHashTable<U, V> {

    private Entry<U, V>[] entries;
    private int size;

    public CHashTable(int size) {
        this.size = size;
        this.entries = new Entry[size];
    }

    public void insert(U key, V value) {
        int hashCode = key.hashCode();
        int index = hashCode % size;

        Entry<U, V> entry = entries[index];

        if(entry == null){
            entries[index] = new Entry<>(key,value);
            return;
        }

        while (entry.getNext() != null) {
            //updates the existing key with new value
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
            entry = entry.getNext();
        }

        //if entry not found,then a new entry is created and node inserted
        entry.setNext(new Entry(key, value));

    }

    public V get(V key) {
        int hashCode = key.hashCode();
        int index = hashCode % size;
        Entry<U, V> entry = entries[index];
        while (entry != null) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
            entry = entry.getNext();
        }

        return null;
    }

    private class Entry<U, V> {

        private U key;
        private V value;
        private Entry next;

        public Entry getNext() {
            return next;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public U getKey() {
            return key;
        }

        public void setKey(U key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        public Entry() {
        }

        public Entry(U key, V value) {
            this.key = key;
            this.value = value;
        }
    }


}
