package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: xnf reason: default package */
public final class xnf<E> extends xmh<E> {
    public xnf() {
        b(new LinkedQueueNode());
        a(this.producerNode);
        this.consumerNode.lazySet(null);
    }

    public final boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
            this.producerNode.lazySet(linkedQueueNode);
            this.producerNode = linkedQueueNode;
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final E peek() {
        LinkedQueueNode linkedQueueNode = (LinkedQueueNode) this.consumerNode.get();
        if (linkedQueueNode != null) {
            return linkedQueueNode.value;
        }
        return null;
    }

    public final E poll() {
        LinkedQueueNode linkedQueueNode = (LinkedQueueNode) this.consumerNode.get();
        if (linkedQueueNode == null) {
            return null;
        }
        E a = linkedQueueNode.a();
        this.consumerNode = linkedQueueNode;
        return a;
    }
}
