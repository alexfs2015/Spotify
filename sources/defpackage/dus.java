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

@cfp
/* renamed from: dus reason: default package */
public final class dus extends duy {
    private eds e;
    private edw f;
    private edz g;
    private final duv h;
    private dut i;
    private boolean j;
    private Object k;

    private dus(Context context, duv duv, dio dio, duw duw) {
        super(context, duv, null, dio, null, duw, null, null);
        this.j = false;
        this.k = new Object();
        this.h = duv;
    }

    public dus(Context context, duv duv, dio dio, eds eds, duw duw) {
        this(context, duv, dio, duw);
        this.e = eds;
    }

    public dus(Context context, duv duv, dio dio, edw edw, duw duw) {
        this(context, duv, dio, duw);
        this.f = edw;
    }

    public dus(Context context, duv duv, dio dio, edz edz, duw duw) {
        this(context, duv, dio, duw);
        this.g = edz;
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

    public final View a(OnClickListener onClickListener, boolean z) {
        cbi cbi;
        synchronized (this.k) {
            if (this.i != null) {
                View a = this.i.a(onClickListener, z);
                return a;
            }
            try {
                if (this.g != null) {
                    cbi = this.g.l();
                } else if (this.e != null) {
                    cbi = this.e.n();
                } else {
                    if (this.f != null) {
                        cbi = this.f.k();
                    }
                    cbi = null;
                }
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            if (cbi == null) {
                return null;
            }
            View view = (View) cbj.a(cbi);
            return view;
        }
    }

    public final void a(View view) {
        synchronized (this.k) {
            if (this.i != null) {
                this.i.a(view);
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map) {
        duv duv;
        bxo.b("recordImpression must be called on the main UI thread.");
        synchronized (this.k) {
            this.c = true;
            if (this.i != null) {
                this.i.a(view, map);
                this.h.aa();
            } else {
                try {
                    if (this.g != null && !this.g.p()) {
                        this.g.r();
                        duv = this.h;
                    } else if (this.e != null && !this.e.j()) {
                        this.e.i();
                        duv = this.h;
                    } else if (this.f != null && !this.f.h()) {
                        this.f.g();
                        duv = this.h;
                    }
                    duv.aa();
                } catch (RemoteException unused) {
                    cpn.a(5);
                }
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        duv duv;
        bxo.b("performClick must be called on the main UI thread.");
        synchronized (this.k) {
            if (this.i != null) {
                this.i.a(view, map, bundle, view2);
                this.h.e();
            } else {
                try {
                    if (this.g != null && !this.g.q()) {
                        this.g.a(cbj.a(view));
                        duv = this.h;
                    } else if (this.e != null && !this.e.k()) {
                        this.e.a(cbj.a(view));
                        duv = this.h;
                    } else if (this.f != null && !this.f.i()) {
                        this.f.a(cbj.a(view));
                        duv = this.h;
                    }
                    duv.e();
                } catch (RemoteException unused) {
                    cpn.a(5);
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
                    this.g.a(cbj.a(view), cbj.a(b), cbj.a(b2));
                } else if (this.e != null) {
                    this.e.a(cbj.a(view), cbj.a(b), cbj.a(b2));
                    this.e.b(cbj.a(view));
                } else if (this.f != null) {
                    this.f.a(cbj.a(view), cbj.a(b), cbj.a(b2));
                    this.f.b(cbj.a(view));
                }
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            this.j = false;
        }
    }

    public final void a(dut dut) {
        synchronized (this.k) {
            this.i = dut;
        }
    }

    public final void a(dxj dxj) {
        synchronized (this.k) {
            if (this.i != null) {
                this.i.a(dxj);
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

    public final void b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.k) {
            try {
                if (this.g != null) {
                    this.g.b(cbj.a(view));
                } else if (this.e != null) {
                    this.e.c(cbj.a(view));
                } else if (this.f != null) {
                    this.f.c(cbj.a(view));
                }
            } catch (RemoteException unused) {
                cpn.a(5);
            }
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
        bxo.b("recordDownloadedImpression must be called on main UI thread.");
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

    public final dut f() {
        dut dut;
        synchronized (this.k) {
            dut = this.i;
        }
        return dut;
    }

    public final cti g() {
        return null;
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
        dut dut = this.i;
        if (dut != null) {
            dut.j();
        }
    }

    public final void k() {
        dut dut = this.i;
        if (dut != null) {
            dut.k();
        }
    }
}
