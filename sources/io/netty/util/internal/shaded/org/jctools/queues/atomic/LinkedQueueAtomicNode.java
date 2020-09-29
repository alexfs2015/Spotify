package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class LinkedQueueAtomicNode<E> extends AtomicReference<LinkedQueueAtomicNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    public E value;

    public LinkedQueueAtomicNode() {
    }

    public LinkedQueueAtomicNode(E e) {
        this.value = e;
    }
}
