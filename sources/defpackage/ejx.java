package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: ejx reason: default package */
final class ejx extends WeakReference<Throwable> {
    private final int a;

    public ejx(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            ejx ejx = (ejx) obj;
            return this.a == ejx.a && get() == ejx.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
