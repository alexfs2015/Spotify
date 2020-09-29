package defpackage;

import io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wkv reason: default package */
abstract class wkv<E> extends AbstractQueue<E> {
    private final AtomicReference<LinkedQueueAtomicNode<E>> a = new AtomicReference<>();
    private final AtomicReference<LinkedQueueAtomicNode<E>> b = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public final LinkedQueueAtomicNode<E> a() {
        return (LinkedQueueAtomicNode) this.a.get();
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueAtomicNode<E> a(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        return (LinkedQueueAtomicNode) this.a.getAndSet(linkedQueueAtomicNode);
    }

    private LinkedQueueAtomicNode<E> c() {
        return (LinkedQueueAtomicNode) this.b.get();
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueAtomicNode<E> b() {
        return (LinkedQueueAtomicNode) this.b.get();
    }

    /* access modifiers changed from: protected */
    public final void b(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        this.b.lazySet(linkedQueueAtomicNode);
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueAtomicNode c = c();
        LinkedQueueAtomicNode a2 = a();
        int i = 0;
        while (c != a2 && c != null && i < Integer.MAX_VALUE) {
            LinkedQueueAtomicNode linkedQueueAtomicNode = (LinkedQueueAtomicNode) c.get();
            c = linkedQueueAtomicNode == c ? c() : linkedQueueAtomicNode;
            i++;
        }
        return i;
    }

    public final boolean isEmpty() {
        return c() == a();
    }

    /* access modifiers changed from: protected */
    public final E a(LinkedQueueAtomicNode<E> linkedQueueAtomicNode, LinkedQueueAtomicNode<E> linkedQueueAtomicNode2) {
        E e = linkedQueueAtomicNode2.value;
        linkedQueueAtomicNode2.value = null;
        linkedQueueAtomicNode.lazySet(linkedQueueAtomicNode);
        b(linkedQueueAtomicNode2);
        return e;
    }
}
