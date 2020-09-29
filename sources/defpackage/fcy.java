package defpackage;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

/* renamed from: fcy reason: default package */
public abstract class fcy<E> extends fcq<E> implements Set<E> {
    protected fcy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Set<E> delegate();

    /* access modifiers changed from: protected */
    public final boolean b(Collection<?> collection) {
        return Sets.a((Set<?>) this, (Collection) fbp.a(collection));
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }
}
