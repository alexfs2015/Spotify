package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    public E value;

    public LinkedQueueNode() {
    }

    public LinkedQueueNode(E e) {
        this.value = e;
    }

    public final E a() {
        E e = this.value;
        this.value = null;
        return e;
    }
}
