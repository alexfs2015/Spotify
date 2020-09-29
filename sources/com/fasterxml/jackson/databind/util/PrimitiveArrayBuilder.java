package com.fasterxml.jackson.databind.util;

public abstract class PrimitiveArrayBuilder<T> {
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t, int i) {
            this._data = t;
            this._dataLength = i;
        }

        public final int copyData(T t, int i) {
            System.arraycopy(this._data, 0, t, i, this._dataLength);
            return i + this._dataLength;
        }

        public final T getData() {
            return this._data;
        }

        public final void linkNext(Node<T> node) {
            if (this._next == null) {
                this._next = node;
                return;
            }
            throw new IllegalStateException();
        }

        public final Node<T> next() {
            return this._next;
        }
    }

    protected PrimitiveArrayBuilder() {
    }

    /* access modifiers changed from: protected */
    public abstract T _constructArray(int i);

    /* access modifiers changed from: protected */
    public void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t, int i) {
        Node<T> node = new Node<>(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i;
        return _constructArray(i < 16384 ? i + i : i + (i >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t, int i) {
        int i2 = this._bufferedEntryCount + i;
        T _constructArray = _constructArray(i2);
        int i3 = 0;
        for (Node<T> node = this._bufferHead; node != null; node = node.next()) {
            i3 = node.copyData(_constructArray, i3);
        }
        System.arraycopy(t, 0, _constructArray, i3, i);
        int i4 = i3 + i;
        if (i4 == i2) {
            return _constructArray;
        }
        StringBuilder sb = new StringBuilder("Should have gotten ");
        sb.append(i2);
        sb.append(" entries, got ");
        sb.append(i4);
        throw new IllegalStateException(sb.toString());
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }
}
