package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: wya reason: default package */
public final class wya<E> extends wxw<E> {
    public wya() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        a(linkedQueueNode);
        c(linkedQueueNode);
        linkedQueueNode.lazySet(null);
    }

    public final boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
            ((LinkedQueueNode) this.a.get()).lazySet(linkedQueueNode);
            a(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final E poll() {
        LinkedQueueNode linkedQueueNode = (LinkedQueueNode) b().get();
        if (linkedQueueNode == null) {
            return null;
        }
        E a = linkedQueueNode.a();
        c(linkedQueueNode);
        return a;
    }

    public final E peek() {
        LinkedQueueNode linkedQueueNode = (LinkedQueueNode) b().get();
        if (linkedQueueNode != null) {
            return linkedQueueNode.value;
        }
        return null;
    }
}
