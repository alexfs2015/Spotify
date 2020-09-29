package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: xmb reason: default package */
abstract class xmb<E> extends AbstractQueue<E> {
    final AtomicReference<LinkedQueueNode<E>> a = new AtomicReference<>();
    private final AtomicReference<LinkedQueueNode<E>> b = new AtomicReference<>();

    private LinkedQueueNode<E> c() {
        return (LinkedQueueNode) this.b.get();
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> a() {
        return (LinkedQueueNode) this.a.get();
    }

    /* access modifiers changed from: protected */
    public final void a(LinkedQueueNode<E> linkedQueueNode) {
        this.a.lazySet(linkedQueueNode);
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> b() {
        return (LinkedQueueNode) this.b.get();
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> b(LinkedQueueNode<E> linkedQueueNode) {
        return (LinkedQueueNode) this.a.getAndSet(linkedQueueNode);
    }

    /* access modifiers changed from: protected */
    public final void c(LinkedQueueNode<E> linkedQueueNode) {
        this.b.lazySet(linkedQueueNode);
    }

    public final boolean isEmpty() {
        return c() == a();
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode c = c();
        LinkedQueueNode a2 = a();
        int i = 0;
        while (c != a2 && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNode = (LinkedQueueNode) c.get();
            } while (linkedQueueNode == null);
            i++;
            c = linkedQueueNode;
        }
        return i;
    }
}
