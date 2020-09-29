package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@cey
/* renamed from: bjm reason: default package */
public final class bjm implements OnGlobalLayoutListener, OnScrollChangedListener {
    List<Integer> A;
    dth B;
    ciw C;
    cio D;
    public String E;
    List<String> F;
    public clm G;
    View H;
    public int I;
    boolean J;
    HashSet<clb> K;
    boolean L;
    boolean M;
    boolean N;
    private int O;
    private int P;
    private cob Q;
    final String a;
    public String b;
    public final Context c;
    final dhx d;
    public final coy e;
    bjn f;
    public clp g;
    public cmv h;
    public dpc i;
    public ckz j;
    public cla k;
    public clb l;
    dpp m;
    dps n;
    dqm o;
    dqi p;
    dqs q;
    dwa r;
    dwd s;
    dwp t;
    dv<String, dwh> u;
    dv<String, dwk> v;
    dup w;
    dry x;
    drf y;
    dwn z;

    public bjm(Context context, dpc dpc, String str, coy coy) {
        this(context, dpc, str, coy, 0);
    }

    private final void b(boolean z2) {
        if (this.f != null) {
            ckz ckz = this.j;
            if (ckz != null && ckz.b != null && this.j.b.x() != null && (!z2 || this.Q.a())) {
                if (this.j.b.x().b()) {
                    int[] iArr = new int[2];
                    this.f.getLocationOnScreen(iArr);
                    dpn.a();
                    int b2 = col.b(this.c, iArr[0]);
                    dpn.a();
                    int b3 = col.b(this.c, iArr[1]);
                    if (!(b2 == this.O && b3 == this.P)) {
                        this.O = b2;
                        this.P = b3;
                        this.j.b.x().a(this.O, this.P, !z2);
                    }
                }
                bjn bjn = this.f;
                if (bjn != null) {
                    View findViewById = bjn.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.f.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.L = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.M = false;
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        ckz ckz = this.j;
        if (ckz != null && ckz.b != null) {
            this.j.b.destroy();
        }
    }

    public final void a(boolean z2) {
        if (this.I == 0) {
            ckz ckz = this.j;
            if (!(ckz == null || ckz.b == null)) {
                this.j.b.stopLoading();
            }
        }
        clp clp = this.g;
        if (clp != null) {
            clp.b();
        }
        cmv cmv = this.h;
        if (cmv != null) {
            cmv.b();
        }
        if (z2) {
            this.j = null;
        }
    }

    public final boolean c() {
        return this.I == 0;
    }

    public final boolean d() {
        return this.I == 1;
    }

    public final void onGlobalLayout() {
        b(false);
    }

    public final void onScrollChanged() {
        b(true);
        this.N = true;
    }

    private bjm(Context context, dpc dpc, String str, coy coy, byte b2) {
        this.G = null;
        this.H = null;
        this.I = 0;
        this.J = false;
        this.K = null;
        this.O = -1;
        this.P = -1;
        this.L = true;
        this.M = true;
        this.N = false;
        dsp.a(context);
        if (bjl.i().a() != null) {
            List b3 = dsp.b();
            if (coy.b != 0) {
                b3.add(Integer.toString(coy.b));
            }
            dss a2 = bjl.i().a();
            if (b3 != null && !b3.isEmpty()) {
                a2.b.put("e", TextUtils.join(",", b3));
            }
        }
        this.a = UUID.randomUUID().toString();
        if (dpc.d || dpc.h) {
            this.f = null;
        } else {
            bjn bjn = new bjn(context, str, coy.a, this, this);
            this.f = bjn;
            this.f.setMinimumWidth(dpc.f);
            this.f.setMinimumHeight(dpc.c);
            this.f.setVisibility(4);
        }
        this.i = dpc;
        this.b = str;
        this.c = context;
        this.e = coy;
        this.d = new dhx(new bhv(this));
        this.Q = new cob(200);
        this.v = new dv<>();
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view) {
        if (((Boolean) dpn.f().a(dsp.bE)).booleanValue()) {
            dht dht = this.d.b;
            if (dht != null) {
                dht.a(view);
            }
        }
    }

    public final void b() {
        ckz ckz = this.j;
        if (!(ckz == null || ckz.p == null)) {
            try {
                this.j.p.c();
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
    }
}
