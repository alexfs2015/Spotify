package defpackage;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

/* renamed from: fcg reason: default package */
public abstract class fcg<E> extends fby<E> implements Set<E> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Set<E> delegate();

    protected fcg() {
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    /* access modifiers changed from: protected */
    public final boolean b(Collection<?> collection) {
        return Sets.a((Set<?>) this, (Collection) fay.a(collection));
    }
}
