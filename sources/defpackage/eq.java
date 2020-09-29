package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: eq reason: default package */
public class eq {
    HashSet<eq> f = new HashSet<>(2);
    public int g = 0;

    public void a() {
    }

    public final void a(eq eqVar) {
        this.f.add(eqVar);
    }

    public void b() {
        this.g = 0;
        this.f.clear();
    }

    public final void c() {
        this.g = 0;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).c();
        }
    }

    public final void d() {
        this.g = 1;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).a();
        }
    }

    public final boolean e() {
        return this.g == 1;
    }
}
