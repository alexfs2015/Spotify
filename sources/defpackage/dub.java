package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@cey
/* renamed from: dub reason: default package */
public final class dub extends duh {
    private edb e;
    private edf f;
    private edi g;
    private final due h;
    private duc i;
    private boolean j;
    private Object k;

    private dub(Context context, due due, dhx dhx, duf duf) {
        super(context, due, null, dhx, null, duf, null, null);
        this.j = false;
        this.k = new Object();
        this.h = due;
    }

    public dub(Context context, due due, dhx dhx, edb edb, duf duf) {
        this(context, due, dhx, duf);
        this.e = edb;
    }

    public dub(Context context, due due, dhx dhx, edf edf, duf duf) {
        this(context, due, dhx, duf);
        this.f = edf;
    }

    public dub(Context context, due due, dhx dhx, edi edi, duf duf) {
        this(context, due, dhx, duf);
        this.g = edi;
    }

    private static HashMap<String, View> b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final void a(View view) {
        synchronized (this.k) {
            if (this.i != null) {
                this.i.a(view);
            }
        }
    }

    public final void a(duc duc) {
        synchronized (this.k) {
            this.i = duc;
        }
    }

    public final void a(dws dws) {
        synchronized (this.k) {
            if (this.i != null) {
                this.i.a(dws);
            }
        }
    }

    public final boolean a() {
        synchronized (this.k) {
            if (this.i != null) {
                boolean a = this.i.a();
                return a;
            }
            boolean Q = this.h.Q();
            return Q;
        }
    }

    public final boolean b() {
        synchronized (this.k) {
            if (this.i != null) {
                boolean b = this.i.b();
                return b;
            }
            boolean R = this.h.R();
            return R;
        }
    }

    public final void c() {
        synchronized (this.k) {
            if (this.i != null) {
                this.i.c();
            }
        }
    }

    public final void d() {
        bwx.b("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.k) {
            this.d = true;
            if (this.i != null) {
                this.i.d();
            }
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.k) {
            z = this.j;
        }
        return z;
    }

    public final duc f() {
        duc duc;
        synchronized (this.k) {
            duc = this.i;
        }
        return duc;
    }

    public final csr g() {
        return null;
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
        duc duc = this.i;
        if (duc != null) {
            duc.j();
        }
    }

    public final void k() {
        duc duc = this.i;
        if (duc != null) {
            duc.k();
        }
    }

    public final View a(OnClickListener onClickListener, boolean z) {
        car car;
        synchronized (this.k) {
            if (this.i != null) {
                View a = this.i.a(onClickListener, z);
                return a;
            }
            try {
                if (this.g != null) {
                    car = this.g.l();
                } else if (this.e != null) {
                    car = this.e.n();
                } else {
                    if (this.f != null) {
                        car = this.f.k();
                    }
                    car = null;
                }
            } catch (RemoteException unused) {
                cow.a(5);
            }
            if (car == null) {
                return null;
            }
            View view = (View) cas.a(car);
            return view;
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map) {
        due due;
        bwx.b("recordImpression must be called on the main UI thread.");
        synchronized (this.k) {
            this.c = true;
            if (this.i != null) {
                this.i.a(view, map);
                this.h.aa();
            } else {
                try {
                    if (this.g != null && !this.g.p()) {
                        this.g.r();
                        due = this.h;
                    } else if (this.e != null && !this.e.j()) {
                        this.e.i();
                        due = this.h;
                    } else if (this.f != null && !this.f.h()) {
                        this.f.g();
                        due = this.h;
                    }
                    due.aa();
                } catch (RemoteException unused) {
                    cow.a(5);
                }
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        due due;
        bwx.b("performClick must be called on the main UI thread.");
        synchronized (this.k) {
            if (this.i != null) {
                this.i.a(view, map, bundle, view2);
                this.h.e();
            } else {
                try {
                    if (this.g != null && !this.g.q()) {
                        this.g.a(cas.a(view));
                        due = this.h;
                    } else if (this.e != null && !this.e.k()) {
                        this.e.a(cas.a(view));
                        due = this.h;
                    } else if (this.f != null && !this.f.i()) {
                        this.f.a(cas.a(view));
                        due = this.h;
                    }
                    due.e();
                } catch (RemoteException unused) {
                    cow.a(5);
                }
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.k) {
            this.j = true;
            HashMap b = b(map);
            HashMap b2 = b(map2);
            try {
                if (this.g != null) {
                    this.g.a(cas.a(view), cas.a(b), cas.a(b2));
                } else if (this.e != null) {
                    this.e.a(cas.a(view), cas.a(b), cas.a(b2));
                    this.e.b(cas.a(view));
                } else if (this.f != null) {
                    this.f.a(cas.a(view), cas.a(b), cas.a(b2));
                    this.f.b(cas.a(view));
                }
            } catch (RemoteException unused) {
                cow.a(5);
            }
            this.j = false;
        }
    }

    public final void b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.k) {
            try {
                if (this.g != null) {
                    this.g.b(cas.a(view));
                } else if (this.e != null) {
                    this.e.c(cas.a(view));
                } else if (this.f != null) {
                    this.f.c(cas.a(view));
                }
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
    }
}
