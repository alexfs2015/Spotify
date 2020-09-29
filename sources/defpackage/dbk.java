package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: dbk reason: default package */
final class dbk extends WeakReference<Throwable> {
    private final int a;

    public dbk(Throwable th) {
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
            dbk dbk = (dbk) obj;
            return this.a == dbk.a && get() == dbk.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
