package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hir reason: default package */
public class hir implements hgk {
    private final AtomicInteger a = new AtomicInteger(0);
    private final Object b = new Object();
    private final Context c;
    private final hhc d;
    private final Random e;
    /* access modifiers changed from: private */
    public final Semaphore f = new Semaphore(1);
    private final Set<Object> g = new LinkedHashSet();
    /* access modifiers changed from: private */
    public hmu h;
    private final ServiceConnection i = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            hir.this.h = (hmu) fay.a(((hhx) iBinder).a.e);
            hir.this.h.a(hir.this.j);
            hir.this.f();
            hir.this.f.release();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (!a.a || hir.this.a()) {
                hir.this.e();
                hir.this.g();
                hir.this.f.release();
            }
        }
    };
    /* access modifiers changed from: private */
    public final hhh j = new hhh() {
        public final void a() {
            if (hir.this.a()) {
                hir.this.g();
            }
        }
    };

    public hir(Context context, hhc hhc, Random random) {
        this.c = context;
        this.d = hhc;
        this.e = random;
    }

    public final void b() {
        synchronized (this.b) {
            if (this.a.getAndIncrement() == 0) {
                this.f.acquireUninterruptibly();
                if (!a()) {
                    this.d.a(new Intent(this.c, SpotifyService.class), this.i, hir.class.getSimpleName());
                    Logger.c("Bound to SpotifyService.", new Object[0]);
                    if (!a()) {
                        jrh.a("You're screwed since the service can't be bound when you're querying from the main thread");
                    }
                    this.f.acquireUninterruptibly();
                    this.f.release();
                } else {
                    f();
                    this.f.release();
                }
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            if (this.a.decrementAndGet() == 0 && a()) {
                e();
            }
        }
    }

    public final hmu d() {
        return (hmu) fay.a(this.h);
    }

    public final boolean a() {
        return this.h != null;
    }

    /* access modifiers changed from: private */
    public void e() {
        this.d.a(this.i, hir.class.getSimpleName());
        this.h = null;
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void g() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!this.g.isEmpty() && this.e.nextDouble() >= 0.99d) {
            Assertion.b("Shutdown stopped, cursor(s) leaked (throttled 99% on release)");
        }
    }
}
