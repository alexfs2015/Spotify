package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: dcb reason: default package */
final class dcb extends WeakReference<Throwable> {
    private final int a;

    public dcb(Throwable th) {
        super(th, null);
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
            dcb dcb = (dcb) obj;
            return this.a == dcb.a && get() == dcb.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
