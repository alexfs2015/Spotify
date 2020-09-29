package defpackage;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: hfr reason: default package */
public final class hfr extends c implements hfs {
    final vjj a;
    final long b;
    final Handler c;
    boolean d;
    final Object e = new Object();
    final CompositeDisposable f = new CompositeDisposable();
    final Runnable g = new Runnable() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            hfr.this.c.postDelayed(hfr.this.g, hfr.this.b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(String str, Throwable th) {
            Logger.e("Failed to schedule playlist %s for resync", str);
            hfr.this.d(str);
            hfr.this.c.postDelayed(hfr.this.g, hfr.this.b);
        }

        public final void run() {
            String d = hfr.this.d();
            if (d != null) {
                hfr.this.b(d);
                if (hfr.this.e(d)) {
                    hfr.this.c.post(hfr.this.g);
                    return;
                }
                hfr.this.c(d);
                hfr.this.f.c();
                hfr.this.f.a(hfr.this.a.a(d).c(500, TimeUnit.MILLISECONDS).a((Action) new $$Lambda$hfr$1$KrOK_adrSlZ_T2gOB2KtdlPEhw(this), (Consumer<? super Throwable>) new $$Lambda$hfr$1$PhwQSi3qvLs34KPx2FOQOgrMXrY<Object>(this, d)));
                return;
            }
            synchronized (hfr.this.e) {
                hfr.this.d = false;
            }
        }
    };
    private final Set<String> h = new HashSet(23, 0.75f);
    private final Set<String> i = new HashSet(101, 0.75f);

    public hfr(Handler handler, vjj vjj, long j) {
        this.a = vjj;
        this.c = handler;
        this.b = 200;
    }

    private synchronized boolean f(String str) {
        return this.h.add(str);
    }

    private synchronized void g() {
        this.h.clear();
    }

    public final void a() {
        g();
        synchronized (this.e) {
            this.d = false;
            this.c.removeCallbacks(this.g);
            this.f.c();
        }
    }

    public final void a(String str) {
        if (!e(str) && f(str)) {
            synchronized (this.e) {
                if (!this.d) {
                    this.d = true;
                    this.c.post(this.g);
                }
            }
        }
    }

    public final synchronized void b(String str) {
        this.h.remove(str);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void c(String str) {
        this.i.add(str);
    }

    /* access modifiers changed from: 0000 */
    public synchronized String d() {
        Iterator it = this.h.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (String) it.next();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void d(String str) {
        this.i.remove(str);
    }

    /* access modifiers changed from: 0000 */
    public synchronized boolean e(String str) {
        return this.i.contains(str);
    }
}
