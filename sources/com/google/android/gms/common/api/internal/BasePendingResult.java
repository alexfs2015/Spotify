package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import defpackage.btc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends btc> extends bsz<R> {
    static final ThreadLocal<Boolean> d = new bwh();
    private final Object a;
    private final a<R> b;
    private final WeakReference<bsy> c;
    private final CountDownLatch e;
    private final ArrayList<defpackage.bsz.a> f;
    private btd<? super R> g;
    private final AtomicReference<bvw> h;
    /* access modifiers changed from: private */
    public R i;
    private Status j;
    private volatile boolean k;
    private boolean l;
    private boolean m;
    private b mResultGuardian;
    private bxi n;
    private volatile bvt<R> o;
    private boolean p;

    public static class a<R extends btc> extends egv {
        public a() {
            this(Looper.getMainLooper());
        }

        public a(Looper looper) {
            super(looper);
        }

        public final void a(btd<? super R> btd, R r) {
            sendMessage(obtainMessage(1, new Pair(btd, r)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                btd btd = (btd) pair.first;
                btc btc = (btc) pair.second;
                try {
                    btd.onResult(btc);
                } catch (RuntimeException e) {
                    BasePendingResult.b(btc);
                    throw e;
                }
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                new Exception();
            } else {
                ((BasePendingResult) message.obj).c(Status.d);
            }
        }
    }

    final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.b(BasePendingResult.this.i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.e = new CountDownLatch(1);
        this.f = new ArrayList<>();
        this.h = new AtomicReference<>();
        this.p = false;
        this.b = new a<>(Looper.getMainLooper());
        this.c = new WeakReference<>(null);
    }

    protected BasePendingResult(bsy bsy) {
        this.a = new Object();
        this.e = new CountDownLatch(1);
        this.f = new ArrayList<>();
        this.h = new AtomicReference<>();
        this.p = false;
        this.b = new a<>(bsy != null ? bsy.c() : Looper.getMainLooper());
        this.c = new WeakReference<>(bsy);
    }

    private final R a() {
        R r;
        synchronized (this.a) {
            bxo.a(!this.k, (Object) "Result has already been consumed.");
            bxo.a(e(), (Object) "Result is not ready.");
            r = this.i;
            this.i = null;
            this.g = null;
            this.k = true;
        }
        bvw bvw = (bvw) this.h.getAndSet(null);
        if (bvw != null) {
            bvw.a(this);
        }
        return r;
    }

    public static void b(btc btc) {
        if (btc instanceof bta) {
        }
    }

    private final void c(R r) {
        this.i = r;
        this.n = null;
        this.e.countDown();
        this.j = this.i.B_();
        int i2 = 0;
        if (this.l) {
            this.g = null;
        } else if (this.g != null) {
            this.b.removeMessages(2);
            this.b.a(this.g, a());
        } else if (this.i instanceof bta) {
            this.mResultGuardian = new b(this, 0);
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((defpackage.bsz.a) obj).a(this.j);
        }
        this.f.clear();
    }

    public final R a(long j2, TimeUnit timeUnit) {
        bxo.a(!this.k, (Object) "Result has already been consumed.");
        bvt<R> bvt = this.o;
        bxo.a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.e.await(0, timeUnit)) {
                c(Status.d);
            }
        } catch (InterruptedException unused) {
            c(Status.b);
        }
        bxo.a(e(), (Object) "Result is not ready.");
        return a();
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    public final void a(defpackage.bsz.a aVar) {
        bxo.b(true, "Callback cannot be null.");
        synchronized (this.a) {
            if (e()) {
                aVar.a(this.j);
            } else {
                this.f.add(aVar);
            }
        }
    }

    public final void a(R r) {
        synchronized (this.a) {
            if (this.m || this.l) {
                b(r);
                return;
            }
            e();
            boolean z = true;
            bxo.a(!e(), (Object) "Results have already been set");
            if (this.k) {
                z = false;
            }
            bxo.a(z, (Object) "Result has already been consumed");
            c(r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.btd<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.g = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.k     // Catch:{ all -> 0x003a }
            r2 = 1
            if (r1 != 0) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.String r3 = "Result has already been consumed."
            defpackage.bxo.a(r1, r3)     // Catch:{ all -> 0x003a }
            bvt<R> r1 = r4.o     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            defpackage.bxo.a(r2, r1)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.c()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.e()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.b     // Catch:{ all -> 0x003a }
            btc r2 = r4.a()     // Catch:{ all -> 0x003a }
            r1.a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.g = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(btd):void");
    }

    public final void a(bvw bvw) {
        this.h.set(bvw);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.l     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.k     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.i     // Catch:{ all -> 0x0021 }
            b(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.l = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x0021 }
            btc r1 = r2.a(r1)     // Catch:{ all -> 0x0021 }
            r2.c((R) r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.b():void");
    }

    public final void c(Status status) {
        synchronized (this.a) {
            if (!e()) {
                a((R) a(status));
                this.m = true;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.l;
        }
        return z;
    }

    public final Integer d() {
        return null;
    }

    public final boolean e() {
        return this.e.getCount() == 0;
    }

    public final boolean f() {
        boolean c2;
        synchronized (this.a) {
            if (((bsy) this.c.get()) == null || !this.p) {
                b();
            }
            c2 = c();
        }
        return c2;
    }

    public final void g() {
        this.p = this.p || ((Boolean) d.get()).booleanValue();
    }
}
