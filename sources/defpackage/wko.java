package defpackage;

import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wko reason: default package */
public class wko implements wki<wkq>, wkn, wkq {
    private final List<wkq> a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference<Throwable> c = new AtomicReference<>(null);

    public static boolean a(Object obj) {
        try {
            wki wki = (wki) obj;
            wkq wkq = (wkq) obj;
            wkn wkn = (wkn) obj;
            if (!(wki == null || wkq == null || wkn == null)) {
                return true;
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public Priority a() {
        return Priority.NORMAL;
    }

    public final void a(Throwable th) {
        this.c.set(th);
    }

    /* renamed from: a */
    public final synchronized void c(wkq wkq) {
        this.a.add(wkq);
    }

    public final synchronized void b(boolean z) {
        this.b.set(z);
    }

    public final synchronized Collection<wkq> c() {
        return Collections.unmodifiableCollection(this.a);
    }

    public int compareTo(Object obj) {
        return Priority.a(this, obj);
    }

    public final boolean d() {
        for (wkq e : c()) {
            if (!e.e()) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return this.b.get();
    }
}
