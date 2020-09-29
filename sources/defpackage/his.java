package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: his reason: default package */
public final class his {
    public boolean a;
    public int b = 0;
    private final List<hiw> c;
    private final Deque<hiw> d = new ArrayDeque(4);
    private boolean e;
    private boolean f;

    public his(c cVar, a aVar, b bVar, d dVar) {
        jrh.b("All calls to the driver should happen only on the main thread");
        this.c = ImmutableList.a(new hix(cVar), new hiu(aVar), new hiv(bVar), new hiy(dVar));
    }

    private int e() {
        return this.d.size();
    }

    public void d() {
        g();
        if (!this.f) {
            this.f = true;
            f();
        }
    }

    private void f() {
        this.f = false;
        Logger.b("Target Level: %s, Current Level: %s", Integer.valueOf(this.b), Integer.valueOf(this.d.size()));
        if (!this.e && e() != this.b) {
            while (this.b > e()) {
                hiw hiw = (hiw) this.c.get(this.d.size());
                hiw.a();
                this.d.push(hiw);
            }
            while (this.b < e()) {
                ((hiw) this.d.pop()).b();
            }
        }
    }

    private void g() {
        if (this.e) {
            throw new IllegalStateException("Driver is destroyed");
        }
    }

    public final void a() {
        jrh.b("All calls to the driver should happen only on the main thread");
        Logger.b("wakeUp", new Object[0]);
        this.b = this.a ? 4 : 3;
        d();
    }

    public final void b() {
        jrh.b("All calls to the driver should happen only on the main thread");
        Logger.b("shutdown", new Object[0]);
        this.b = Math.min(this.b, 1);
        d();
    }

    public final void c() {
        jrh.b("All calls to the driver should happen only on the main thread");
        Logger.b("destroy", new Object[0]);
        while (!this.d.isEmpty()) {
            ((hiw) this.d.pop()).b();
        }
        this.e = true;
    }
}
