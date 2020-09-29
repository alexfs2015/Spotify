package com.comscore.android.task;

import java.util.concurrent.atomic.AtomicBoolean;

class a implements Runnable {
    private AtomicBoolean a;
    private AtomicBoolean b;
    private Runnable c;
    private long d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private Exception i;

    a(Runnable runnable) {
        this(runnable, 0);
    }

    a(Runnable runnable, long j) {
        this(runnable, j, 0);
    }

    a(Runnable runnable, long j, long j2) {
        this(runnable, j, j2, true);
    }

    a(Runnable runnable, long j, long j2, boolean z) {
        this.c = runnable;
        this.d = System.currentTimeMillis() + (j > 0 ? j : 0);
        this.g = j > 0;
        this.e = System.currentTimeMillis();
        this.f = j2;
        this.a = new AtomicBoolean();
        this.b = new AtomicBoolean();
        this.b.set(false);
        this.a.set(false);
        this.i = null;
        this.h = z;
    }

    /* access modifiers changed from: 0000 */
    public long a() {
        long currentTimeMillis = this.d - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            return currentTimeMillis;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public long b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.a.get();
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.b.get();
    }

    /* access modifiers changed from: 0000 */
    public long f() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.f > 0;
    }

    /* access modifiers changed from: 0000 */
    public long h() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public Runnable i() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Exception j() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.h;
    }

    public void run() {
        this.a.set(true);
        try {
            this.c.run();
        } catch (Exception e2) {
            this.i = e2;
        }
        this.a.set(false);
        this.b.set(true);
    }
}
