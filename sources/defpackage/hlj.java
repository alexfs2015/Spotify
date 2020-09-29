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

/* renamed from: hlj reason: default package */
public class hlj implements hjg {
    private final AtomicInteger a = new AtomicInteger(0);
    private final Object b = new Object();
    private final Context c;
    private final hjw d;
    private final Random e;
    /* access modifiers changed from: private */
    public final Semaphore f = new Semaphore(1);
    private final Set<Object> g = new LinkedHashSet();
    /* access modifiers changed from: private */
    public hpl h;
    private final ServiceConnection i = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            hlj.this.h = (hpl) fbp.a(((hkr) iBinder).a.e);
            hlj.this.h.a(hlj.this.j);
            hlj.this.f();
            hlj.this.f.release();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (!a.a || hlj.this.a()) {
                hlj.this.e();
                hlj.this.g();
                hlj.this.f.release();
            }
        }
    };
    /* access modifiers changed from: private */
    public final hkb j = new hkb() {
        public final void a() {
            if (hlj.this.a()) {
                hlj.this.g();
            }
        }
    };

    public hlj(Context context, hjw hjw, Random random) {
        this.c = context;
        this.d = hjw;
        this.e = random;
    }

    /* access modifiers changed from: private */
    public void e() {
        this.d.a(this.i, hlj.class.getSimpleName());
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

    public final boolean a() {
        return this.h != null;
    }

    public final void b() {
        synchronized (this.b) {
            if (this.a.getAndIncrement() == 0) {
                this.f.acquireUninterruptibly();
                if (!a()) {
                    this.d.a(new Intent(this.c, SpotifyService.class), this.i, hlj.class.getSimpleName());
                    Logger.c("Bound to SpotifyService.", new Object[0]);
                    if (!a()) {
                        jtr.a("You're screwed since the service can't be bound when you're querying from the main thread");
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

    public final hpl d() {
        return (hpl) fbp.a(this.h);
    }
}
