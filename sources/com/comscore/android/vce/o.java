package com.comscore.android.vce;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;

class o {
    static final String a = "LifeCycle";
    final p b;
    final b c;
    final s d;
    final i e;
    final k f;
    ActivityLifecycleCallbacks g;
    final HashMap<String, String> h = new HashMap<>();
    boolean i = false;
    boolean j = true;
    boolean k = false;
    long l = -1;
    /* access modifiers changed from: private */
    public volatile boolean m = true;

    class a implements ActivityLifecycleCallbacks {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(final Activity activity) {
            o.this.d.a((Runnable) new Runnable() {
                public void run() {
                    try {
                        o.this.b(activity);
                    } catch (Exception unused) {
                    }
                }
            });
        }

        public void onActivityResumed(final Activity activity) {
            if (o.this.m) {
                o.this.m = false;
            }
            o.this.d.a((Runnable) new Runnable() {
                public void run() {
                    try {
                        o.this.c(activity);
                    } catch (Exception unused) {
                    }
                }
            });
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    o(p pVar, b bVar, s sVar, i iVar, k kVar) {
        this.b = pVar;
        this.c = bVar;
        this.d = sVar;
        this.e = iVar;
        this.f = kVar;
    }

    /* access modifiers changed from: private */
    public void a(final WeakReference<Activity> weakReference) {
        this.d.a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (o.this.m) {
                        Activity activity = (Activity) weakReference.get();
                        if (activity != null && o.this.f.d(activity)) {
                            o.this.c(activity);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    private void h() {
        this.d.a(new Runnable() {
            public void run() {
                if (o.this.m) {
                    o.this.i();
                }
            }
        }, 1500);
    }

    /* access modifiers changed from: private */
    public void i() {
        this.d.b(new Runnable() {
            public void run() {
                try {
                    if (o.this.m) {
                        Activity m = o.this.f.m();
                        if (m != null) {
                            o.this.a(new WeakReference<>(m));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (this.g != null) {
            this.d.b().unregisterActivityLifecycleCallbacks(this.g);
            this.g = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity) {
        this.e.a(activity);
        if (activity != null) {
            this.k = true;
        }
        this.l = this.f.l();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.l = -1;
        this.e.e();
    }

    /* access modifiers changed from: 0000 */
    public void b(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.h.containsKey(localClassName)) {
            this.h.remove(localClassName);
        }
        if (!this.i) {
            this.i = true;
            this.d.a(new Runnable() {
                public void run() {
                    try {
                        o.this.i = false;
                        if (o.this.h.size() == 0 && !o.this.c.j()) {
                            o.this.c();
                        }
                    } catch (Exception unused) {
                    }
                }
            }, 1000);
        }
        b();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.e.a();
    }

    /* access modifiers changed from: 0000 */
    public void c(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (!this.h.containsKey(localClassName)) {
            this.h.put(localClassName, "ACTIVE");
        }
        if (this.c.j()) {
            d();
        }
        a(activity);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.e.b();
    }

    /* access modifiers changed from: 0000 */
    public Runnable e() {
        return new Runnable() {
            public void run() {
                try {
                    o.this.g();
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        this.g = new a();
        this.d.b().registerActivityLifecycleCallbacks(this.g);
        h();
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        Activity d2 = this.d.d();
        if (d2 != null && this.l != -1 && this.f.l() - this.l >= 300) {
            if (this.k) {
                this.k = false;
                this.e.b(d2);
            }
            boolean d3 = this.f.d(d2);
            if (this.j != d3) {
                this.j = d3;
                if (this.j) {
                    this.e.c();
                    return;
                }
                this.e.d();
            }
        }
    }
}
