package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fif reason: default package */
public final class fif extends fih implements Iterable<fih> {
    private final List<fih> a = new ArrayList();

    public final void a(fih fih) {
        if (fih == null) {
            fih = fii.a;
        }
        this.a.add(fih);
    }

    public final Iterator<fih> iterator() {
        return this.a.iterator();
    }

    public final Number a() {
        if (this.a.size() == 1) {
            return ((fih) this.a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    public final String b() {
        if (this.a.size() == 1) {
            return ((fih) this.a.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public final double c() {
        if (this.a.size() == 1) {
            return ((fih) this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final long d() {
        if (this.a.size() == 1) {
            return ((fih) this.a.get(0)).d();
        }
        throw new IllegalStateException();
    }

    public final int e() {
        if (this.a.size() == 1) {
            return ((fih) this.a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean f() {
        if (this.a.size() == 1) {
            return ((fih) this.a.get(0)).f();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof fif) && ((fif) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
