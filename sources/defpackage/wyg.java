package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: wyg reason: default package */
abstract class wyg<E> extends wye<E> {
    protected static final long a = wzh.a(wyg.class, "producerNode");
    protected LinkedQueueNode<E> producerNode;

    wyg() {
    }

    /* access modifiers changed from: protected */
    public final void b(LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> c() {
        return (LinkedQueueNode) wzh.a.getObjectVolatile(this, a);
    }
}
