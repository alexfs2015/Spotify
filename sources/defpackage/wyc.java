package defpackage;

import java.util.Iterator;
import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: wyc reason: default package */
abstract class wyc<E> extends wyd<E> {
    wyc() {
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode a = a();
        LinkedQueueNode c = c();
        int i = 0;
        while (a != c && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNode = (LinkedQueueNode) a.get();
            } while (linkedQueueNode == null);
            i++;
            a = linkedQueueNode;
        }
        return i;
    }

    public final boolean isEmpty() {
        return a() == c();
    }
}
