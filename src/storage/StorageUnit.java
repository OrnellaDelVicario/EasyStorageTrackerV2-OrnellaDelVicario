package storage;

import exception.EmptyStorageException;

public class StorageUnit<T> {
    private T item; // The stored item

    // Add item to storage
    public void addItem(T item) {
        this.item = item;
        System.out.println("Item stored successfully: " + item);
    }

    // Retrieve item
    public T getItem() throws EmptyStorageException {
        if (item == null) { // 🧠 This is how we know it's empty!
            throw new EmptyStorageException("Storage is empty! Cannot retrieve item.");
        }
        return item;
    }
}