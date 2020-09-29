package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ikf reason: default package */
public abstract class ikf {
    private static final AtomicInteger c = new AtomicInteger();
    private static final AtomicInteger d = new AtomicInteger();
    public final Set<Integer> a = new LinkedHashSet();
    protected final hne b;
    private final a e;

    /* renamed from: ikf$a */
    public interface a {
        void a(int i, int i2, Object obj);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public abstract void a(ija ija, int i);

    /* access modifiers changed from: protected */
    public void b() {
    }

    ikf(hne hne, a aVar) {
        this.b = (hne) fay.a(hne);
        this.e = (a) fay.a(aVar);
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

    public final void a(int i) {
        this.a.remove(Integer.valueOf(i));
    }

    public final synchronized void e() {
        this.a.clear();
        b();
    }

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
}
