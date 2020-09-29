package com.comscore.android.vce;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

class ag {
    static final String a = "ScrollNation";
    final p b;
    OnScrollChangedListener c;
    final Set<x> d = new HashSet();
    Runnable e;
    long f;
    ScheduledFuture g;
    ah<Activity> h;
    final s i;
    final k j;

    ag(p pVar, s sVar, k kVar) {
        this.b = pVar;
        this.i = sVar;
        this.j = kVar;
        e();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        d();
    }

    /* access modifiers changed from: 0000 */
    public void a(final x xVar) {
        this.i.a((Runnable) new Runnable() {
            public void run() {
                try {
                    ag.this.b(xVar);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.h != null) {
            d();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(x xVar) {
        if (this.h == null) {
            c();
        }
        if (!this.d.contains(xVar)) {
            this.d.add(xVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.h == null) {
            Activity d2 = this.i.d();
            if (!(d2 == null || this.c == null)) {
                View b2 = this.j.b(d2);
                if (b2 != null) {
                    ViewTreeObserver viewTreeObserver = b2.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnScrollChangedListener(this.c);
                        this.h = new ah<>(d2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(final x xVar) {
        this.i.a((Runnable) new Runnable() {
            public void run() {
                try {
                    ag.this.d(xVar);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        ah<Activity> ahVar = this.h;
        if (ahVar != null) {
            Activity activity = (Activity) ahVar.get();
            if (activity != null) {
                View b2 = this.j.b(activity);
                if (b2 != null) {
                    ViewTreeObserver viewTreeObserver = b2.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnScrollChangedListener(this.c);
                    }
                }
            }
            this.h.clear();
            this.h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(x xVar) {
        if (this.d.contains(xVar)) {
            this.d.remove(xVar);
            if (this.d.isEmpty() && this.h != null) {
                d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (this.c == null) {
            this.c = new OnScrollChangedListener() {
                public void onScrollChanged() {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - ag.this.f >= ((long) c.u.intValue())) {
                        ag agVar = ag.this;
                        agVar.f = currentTimeMillis;
                        agVar.i.a(ag.this.e);
                        synchronized (this) {
                            if (ag.this.g != null) {
                                ag.this.g.cancel(true);
                                ag.this.g = null;
                            }
                            ag.this.i.a(ag.this.e, c.v.intValue());
                        }
                    }
                }
            };
        }
        this.e = new Runnable() {
            public void run() {
                try {
                    ag.this.f();
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (!this.d.isEmpty() || this.h == null) {
            final HashMap hashMap = new HashMap();
            for (x xVar : this.d) {
                xVar.O();
                if (xVar.l()) {
                    hashMap.put(xVar, xVar.M());
                }
            }
            if (!hashMap.isEmpty()) {
                this.i.b(new Runnable() {
                    public void run() {
                        try {
                            for (x xVar : hashMap.keySet()) {
                                xVar.a((String) hashMap.get(xVar));
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
            return;
        }
        d();
    }
}
