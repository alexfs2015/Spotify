package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ims reason: default package */
public abstract class ims {
    private static final AtomicInteger c = new AtomicInteger();
    private static final AtomicInteger d = new AtomicInteger();
    public final Set<Integer> a = new LinkedHashSet();
    protected final hpt b;
    private final a e;

    /* renamed from: ims$a */
    public interface a {
        void a(int i, int i2, Object obj);
    }

    ims(hpt hpt, a aVar) {
        this.b = (hpt) fbp.a(hpt);
        this.e = (a) fbp.a(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(int i) {
        this.a.remove(Integer.valueOf(i));
    }

    public abstract void a(iln iln, int i);

    public final synchronized void a(Object obj) {
        for (Integer intValue : this.a) {
            this.e.a(intValue.intValue(), d.incrementAndGet(), obj);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized boolean a(int i, Object obj) {
        if (!this.a.contains(Integer.valueOf(i))) {
            return false;
        }
        this.e.a(i, d.incrementAndGet(), obj);
        return true;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void c() {
        a();
    }

    public final synchronized int d() {
        int incrementAndGet;
        incrementAndGet = c.incrementAndGet();
        this.a.add(Integer.valueOf(incrementAndGet));
        return incrementAndGet;
    }

    public final synchronized void e() {
        this.a.clear();
        b();
    }
}
