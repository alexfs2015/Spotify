package defpackage;

import io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode;

/* renamed from: wzd reason: default package */
public final class wzd<E> extends wzb<E> {
    public wzd() {
        LinkedQueueAtomicNode linkedQueueAtomicNode = new LinkedQueueAtomicNode();
        b(linkedQueueAtomicNode);
        a(linkedQueueAtomicNode);
    }

    public final boolean offer(E e) {
        if (e != null) {
            LinkedQueueAtomicNode linkedQueueAtomicNode = new LinkedQueueAtomicNode(e);
            a(linkedQueueAtomicNode).lazySet(linkedQueueAtomicNode);
            return true;
        }
        throw new NullPointerException();
    }

    public final E peek() {
        LinkedQueueAtomicNode linkedQueueAtomicNode;
        LinkedQueueAtomicNode b = b();
        LinkedQueueAtomicNode linkedQueueAtomicNode2 = (LinkedQueueAtomicNode) b.get();
        if (linkedQueueAtomicNode2 != null) {
            return linkedQueueAtomicNode2.value;
        }
        if (b == a()) {
            return null;
        }
        do {
            linkedQueueAtomicNode = (LinkedQueueAtomicNode) b.get();
        } while (linkedQueueAtomicNode == null);
        return linkedQueueAtomicNode.value;
    }

    public final E poll() {
        LinkedQueueAtomicNode linkedQueueAtomicNode;
        LinkedQueueAtomicNode b = b();
        LinkedQueueAtomicNode linkedQueueAtomicNode2 = (LinkedQueueAtomicNode) b.get();
        if (linkedQueueAtomicNode2 != null) {
            return a(b, linkedQueueAtomicNode2);
        }
        if (b == a()) {
            return null;
        }
        do {
            linkedQueueAtomicNode = (LinkedQueueAtomicNode) b.get();
        } while (linkedQueueAtomicNode == null);
        return a(b, linkedQueueAtomicNode);
    }
}
