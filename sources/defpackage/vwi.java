package defpackage;

import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vwi reason: default package */
public class vwi implements vwc<vwk>, vwh, vwk {
    private final List<vwk> a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference<Throwable> c = new AtomicReference<>(null);

    public final synchronized Collection<vwk> c() {
        return Collections.unmodifiableCollection(this.a);
    }

    /* renamed from: a */
    public final synchronized void c(vwk vwk) {
        this.a.add(vwk);
    }

    public final boolean d() {
        for (vwk e : c()) {
            if (!e.e()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void b(boolean z) {
        this.b.set(z);
    }

    public final boolean e() {
        return this.b.get();
    }

    public Priority a() {
        return Priority.NORMAL;
    }

    public final void a(Throwable th) {
        this.c.set(th);
    }

    public int compareTo(Object obj) {
        return Priority.a(this, obj);
    }

    public static boolean a(Object obj) {
        try {
            vwc vwc = (vwc) obj;
            vwk vwk = (vwk) obj;
            vwh vwh = (vwh) obj;
            if (!(vwc == null || vwk == null || vwh == null)) {
                return true;
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }
}
