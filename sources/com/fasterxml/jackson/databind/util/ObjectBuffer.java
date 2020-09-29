package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

public final class ObjectBuffer {
    private Object[] _freeBuffer;
    private LinkedNode<Object[]> _head;
    private int _size;
    private LinkedNode<Object[]> _tail;

    /* access modifiers changed from: protected */
    public final void _copyTo(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (LinkedNode<Object[]> linkedNode = this._head; linkedNode != null; linkedNode = linkedNode.next()) {
            Object[] objArr2 = (Object[]) linkedNode.value();
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            StringBuilder sb = new StringBuilder("Should have gotten ");
            sb.append(i);
            sb.append(" entries, got ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void _reset() {
        LinkedNode<Object[]> linkedNode = this._tail;
        if (linkedNode != null) {
            this._freeBuffer = (Object[]) linkedNode.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    public final Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public final int bufferedSize() {
        return this._size;
    }

    public final void completeAndClearBuffer(Object[] objArr, int i, List<Object> list) {
        int i2;
        LinkedNode<Object[]> linkedNode = this._head;
        while (true) {
            i2 = 0;
            if (linkedNode == null) {
                break;
            }
            Object[] objArr2 = (Object[]) linkedNode.value();
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            linkedNode = linkedNode.next();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        _reset();
    }

    public final Object[] completeAndClearBuffer(Object[] objArr, int i) {
        int i2 = this._size + i;
        Object[] objArr2 = new Object[i2];
        _copyTo(objArr2, i2, objArr, i);
        _reset();
        return objArr2;
    }

    public final <T> T[] completeAndClearBuffer(Object[] objArr, int i, Class<T> cls) {
        int i2 = this._size + i;
        T[] tArr = (Object[]) Array.newInstance(cls, i2);
        _copyTo(tArr, i2, objArr, i);
        _reset();
        return tArr;
    }

    public final int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public final Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this._freeBuffer = objArr2;
        return objArr2;
    }

    public final Object[] resetAndStart(Object[] objArr, int i) {
        _reset();
        Object[] objArr2 = this._freeBuffer;
        if (objArr2 == null || objArr2.length < i) {
            this._freeBuffer = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this._freeBuffer, 0, i);
        return this._freeBuffer;
    }
}
