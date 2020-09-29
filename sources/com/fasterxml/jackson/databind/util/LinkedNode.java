package com.fasterxml.jackson.databind.util;

public final class LinkedNode<T> {
    private LinkedNode<T> next;
    private final T value;

    public LinkedNode(T t, LinkedNode<T> linkedNode) {
        this.value = t;
        this.next = linkedNode;
    }

    public final void linkNext(LinkedNode<T> linkedNode) {
        if (this.next == null) {
            this.next = linkedNode;
            return;
        }
        throw new IllegalStateException();
    }

    public final LinkedNode<T> next() {
        return this.next;
    }

    public final T value() {
        return this.value;
    }
}
