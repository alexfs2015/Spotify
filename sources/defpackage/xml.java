package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: xml reason: default package */
abstract class xml<E> extends xmj<E> {
    protected static final long a = xnm.a(xml.class, "producerNode");
    protected LinkedQueueNode<E> producerNode;

    xml() {
    }

    /* access modifiers changed from: protected */
    public final void b(LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> c() {
        return (LinkedQueueNode) xnm.a.getObjectVolatile(this, a);
    }
}
