package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fiz reason: default package */
public final class fiz extends fjb implements Iterable<fjb> {
    private final List<fjb> a = new ArrayList();

    public final Number a() {
        if (this.a.size() == 1) {
            return ((fjb) this.a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    public final void a(fjb fjb) {
        if (fjb == null) {
            fjb = fjc.a;
        }
        this.a.add(fjb);
    }

    public final String b() {
        if (this.a.size() == 1) {
            return ((fjb) this.a.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public final double c() {
        if (this.a.size() == 1) {
            return ((fjb) this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final long d() {
        if (this.a.size() == 1) {
            return ((fjb) this.a.get(0)).d();
        }
        throw new IllegalStateException();
    }

    public final int e() {
        if (this.a.size() == 1) {
            return ((fjb) this.a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof fiz) && ((fiz) obj).a.equals(this.a));
    }

    public final boolean f() {
        if (this.a.size() == 1) {
            return ((fjb) this.a.get(0)).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<fjb> iterator() {
        return this.a.iterator();
    }
}
