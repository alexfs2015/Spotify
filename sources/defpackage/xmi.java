package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: xmi reason: default package */
abstract class xmi<E> extends xmk<E> {
    private static long b = xnm.a(xmi.class, "consumerNode");
    protected LinkedQueueNode<E> consumerNode;

    xmi() {
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> a() {
        return (LinkedQueueNode) xnm.a.getObjectVolatile(this, b);
    }

    /* access modifiers changed from: protected */
    public final void a(LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> b() {
        return this.consumerNode;
    }
}
