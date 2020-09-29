package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: wxx reason: default package */
public final class wxx<E> extends wxw<E> {
    public wxx() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        c(linkedQueueNode);
        b(linkedQueueNode);
    }

    public final boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
            b(linkedQueueNode).lazySet(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final E poll() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode b = b();
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) b.get();
        if (linkedQueueNode2 != null) {
            E a = linkedQueueNode2.a();
            c(linkedQueueNode2);
            return a;
        } else if (b == a()) {
            return null;
        } else {
            do {
                linkedQueueNode = (LinkedQueueNode) b.get();
            } while (linkedQueueNode == null);
            E a2 = linkedQueueNode.a();
            c(linkedQueueNode);
            return a2;
        }
    }

    public final E peek() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode b = b();
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) b.get();
        if (linkedQueueNode2 != null) {
            return linkedQueueNode2.value;
        }
        if (b == a()) {
            return null;
        }
        do {
            linkedQueueNode = (LinkedQueueNode) b.get();
        } while (linkedQueueNode == null);
        return linkedQueueNode.value;
    }
}
