package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: wyd reason: default package */
abstract class wyd<E> extends wyf<E> {
    private static long b = wzh.a(wyd.class, "consumerNode");
    protected LinkedQueueNode<E> consumerNode;

    wyd() {
    }

    /* access modifiers changed from: protected */
    public final void a(LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> a() {
        return (LinkedQueueNode) wzh.a.getObjectVolatile(this, b);
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueNode<E> b() {
        return this.consumerNode;
    }
}
