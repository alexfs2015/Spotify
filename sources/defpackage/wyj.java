package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: wyj reason: default package */
public final class wyj<E> extends wyc<E> {
    public wyj() {
        this.consumerNode = new LinkedQueueNode();
        c(this.consumerNode);
    }

    private LinkedQueueNode<E> c(LinkedQueueNode<E> linkedQueueNode) {
        LinkedQueueNode<E> linkedQueueNode2;
        do {
            linkedQueueNode2 = this.producerNode;
        } while (!wzh.a.compareAndSwapObject(this, a, linkedQueueNode2, linkedQueueNode));
        return linkedQueueNode2;
    }

    public final boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
            c(linkedQueueNode).lazySet(linkedQueueNode);
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
            a(linkedQueueNode2);
            return a;
        } else if (b == c()) {
            return null;
        } else {
            do {
                linkedQueueNode = (LinkedQueueNode) b.get();
            } while (linkedQueueNode == null);
            E a2 = linkedQueueNode.a();
            this.consumerNode = linkedQueueNode;
            return a2;
        }
    }

    public final E peek() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode linkedQueueNode2 = this.consumerNode;
        LinkedQueueNode linkedQueueNode3 = (LinkedQueueNode) linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            return linkedQueueNode3.value;
        }
        if (linkedQueueNode2 == c()) {
            return null;
        }
        do {
            linkedQueueNode = (LinkedQueueNode) linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        return linkedQueueNode.value;
    }
}
