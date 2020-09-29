package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    private final AtomicReference<LinkedQueueNode<T>> a = new AtomicReference<>();
    private final AtomicReference<LinkedQueueNode<T>> b = new AtomicReference<>();

    static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e) {
            this.value = e;
        }

        public final E a() {
            E e = this.value;
            this.value = null;
            return e;
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        b(linkedQueueNode);
        a(linkedQueueNode);
    }

    public final boolean a(T t) {
        if (t != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
            a(linkedQueueNode).lazySet(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final void e() {
        while (bc_() != null) {
            if (d()) {
                return;
            }
        }
    }

    private LinkedQueueNode<T> a() {
        return (LinkedQueueNode) this.a.get();
    }

    private LinkedQueueNode<T> a(LinkedQueueNode<T> linkedQueueNode) {
        return (LinkedQueueNode) this.a.getAndSet(linkedQueueNode);
    }

    private LinkedQueueNode<T> b() {
        return (LinkedQueueNode) this.b.get();
    }

    private void b(LinkedQueueNode<T> linkedQueueNode) {
        this.b.lazySet(linkedQueueNode);
    }

    public final boolean d() {
        return b() == a();
    }

    public final T bc_() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) this.b.get();
        LinkedQueueNode linkedQueueNode3 = (LinkedQueueNode) linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            T a2 = linkedQueueNode3.a();
            b(linkedQueueNode3);
            return a2;
        } else if (linkedQueueNode2 == a()) {
            return null;
        } else {
            do {
                linkedQueueNode = (LinkedQueueNode) linkedQueueNode2.get();
            } while (linkedQueueNode == null);
            T a3 = linkedQueueNode.a();
            b(linkedQueueNode);
            return a3;
        }
    }
}
