package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: hlk reason: default package */
public final class hlk {
    public boolean a;
    public int b = 0;
    private final List<hlo> c;
    private final Deque<hlo> d = new ArrayDeque(4);
    private boolean e;
    private boolean f;

    public hlk(c cVar, a aVar, b bVar, d dVar) {
        jtr.b("All calls to the driver should happen only on the main thread");
        this.c = ImmutableList.a(new hlp(cVar), new hlm(aVar), new hln(bVar), new hlq(dVar));
    }

    private int e() {
        return this.d.size();
    }

    private void f() {
        this.f = false;
        Logger.b("Target Level: %s, Current Level: %s", Integer.valueOf(this.b), Integer.valueOf(this.d.size()));
        if (!this.e && e() != this.b) {
            while (this.b > e()) {
                hlo hlo = (hlo) this.c.get(this.d.size());
                hlo.a();
                this.d.push(hlo);
            }
            while (this.b < e()) {
                ((hlo) this.d.pop()).b();
            }
        }
    }

    private void g() {
        if (this.e) {
            throw new IllegalStateException("Driver is destroyed");
        }
    }

    public final void a() {
        jtr.b("All calls to the driver should happen only on the main thread");
        Logger.b("wakeUp", new Object[0]);
        this.b = this.a ? 4 : 3;
        d();
    }

    public final void b() {
        jtr.b("All calls to the driver should happen only on the main thread");
        Logger.b("shutdown", new Object[0]);
        this.b = Math.min(this.b, 1);
        d();
    }

    public final void c() {
        jtr.b("All calls to the driver should happen only on the main thread");
        Logger.b("destroy", new Object[0]);
        while (!this.d.isEmpty()) {
            ((hlo) this.d.pop()).b();
        }
        this.e = true;
    }

    public void d() {
        g();
        if (!this.f) {
            this.f = true;
            f();
        }
    }
}
