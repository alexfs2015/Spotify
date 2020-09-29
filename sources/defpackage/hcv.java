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

/* renamed from: hcv reason: default package */
public final class hcv extends c implements hcw {
    final uxh a;
    final long b;
    final Handler c;
    boolean d;
    final Object e = new Object();
    final CompositeDisposable f = new CompositeDisposable();
    final Runnable g = new Runnable() {
        public final void run() {
            String d = hcv.this.d();
            if (d != null) {
                hcv.this.b(d);
                if (hcv.this.e(d)) {
                    hcv.this.c.post(hcv.this.g);
                    return;
                }
                hcv.this.c(d);
                hcv.this.f.c();
                hcv.this.f.a(hcv.this.a.a(d).c(500, TimeUnit.MILLISECONDS).a((Action) new $$Lambda$hcv$1$pW9hhL3WBSx85Pv6dXkQqNqxRlE(this), (Consumer<? super Throwable>) new $$Lambda$hcv$1$ZkdkKLYRB5RzUEgHG57IGHYxmpQ<Object>(this, d)));
                return;
            }
            synchronized (hcv.this.e) {
                hcv.this.d = false;
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            hcv.this.c.postDelayed(hcv.this.g, hcv.this.b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(String str, Throwable th) {
            Logger.e("Failed to schedule playlist %s for resync", str);
            hcv.this.d(str);
            hcv.this.c.postDelayed(hcv.this.g, hcv.this.b);
        }
    };
    private final Set<String> h = new HashSet(23, 0.75f);
    private final Set<String> i = new HashSet(101, 0.75f);

    public hcv(Handler handler, uxh uxh, long j) {
        this.a = uxh;
        this.c = handler;
        this.b = 200;
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

    public final void a() {
        g();
        synchronized (this.e) {
            this.d = false;
            this.c.removeCallbacks(this.g);
            this.f.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized String d() {
        Iterator it = this.h.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (String) it.next();
    }

    private synchronized boolean f(String str) {
        return this.h.add(str);
    }

    private synchronized void g() {
        this.h.clear();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void c(String str) {
        this.i.add(str);
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
