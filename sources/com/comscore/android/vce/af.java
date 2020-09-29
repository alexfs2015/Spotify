package com.comscore.android.vce;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

class af {
    static final String a = "HitTest";
    final p b;
    final Set<x> c = new HashSet();
    final s d;
    ScheduledFuture e;

    af(p pVar, s sVar) {
        this.b = pVar;
        this.d = sVar;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        d();
    }

    /* access modifiers changed from: 0000 */
    public void a(final x xVar) {
        this.d.a((Runnable) new Runnable() {
            public void run() {
                try {
                    af.this.b(xVar);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.e != null) {
            d();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(x xVar) {
        if (this.e == null) {
            c();
        }
        if (!this.c.contains(xVar)) {
            this.c.add(xVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.e == null) {
            this.e = this.d.a(new Runnable() {
                public void run() {
                    try {
                        af.this.e();
                    } catch (Exception unused) {
                    }
                }
            }, 300, 1000);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(final x xVar) {
        this.d.a((Runnable) new Runnable() {
            public void run() {
                try {
                    af.this.d(xVar);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(x xVar) {
        if (this.c.contains(xVar)) {
            this.c.remove(xVar);
            if (this.c.isEmpty() && this.e != null) {
                d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        for (x xVar : this.c) {
            if (xVar.k()) {
                xVar.R();
            }
        }
    }
}
