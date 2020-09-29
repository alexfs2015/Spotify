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

@cfp
/* renamed from: bkd reason: default package */
public final class bkd implements OnGlobalLayoutListener, OnScrollChangedListener {
    List<Integer> A;
    dty B;
    cjn C;
    cjf D;
    public String E;
    List<String> F;
    public cmd G;
    View H;
    public int I;
    boolean J;
    HashSet<cls> K;
    boolean L;
    boolean M;
    boolean N;
    private int O;
    private int P;
    private cos Q;
    final String a;
    public String b;
    public final Context c;
    final dio d;
    public final cpp e;
    bke f;
    public cmg g;
    public cnm h;
    public dpt i;
    public clq j;
    public clr k;
    public cls l;
    dqg m;
    dqj n;
    drd o;
    dqz p;
    drj q;
    dwr r;
    dwu s;
    dxg t;
    dv<String, dwy> u;
    dv<String, dxb> v;
    dvg w;
    dsp x;
    drw y;
    dxe z;

    public bkd(Context context, dpt dpt, String str, cpp cpp) {
        this(context, dpt, str, cpp, 0);
    }

    private bkd(Context context, dpt dpt, String str, cpp cpp, byte b2) {
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
        dtg.a(context);
        if (bkc.i().a() != null) {
            List b3 = dtg.b();
            if (cpp.b != 0) {
                b3.add(Integer.toString(cpp.b));
            }
            dtj a2 = bkc.i().a();
            if (b3 != null && !b3.isEmpty()) {
                a2.b.put("e", TextUtils.join(",", b3));
            }
        }
        this.a = UUID.randomUUID().toString();
        if (dpt.d || dpt.h) {
            this.f = null;
        } else {
            bke bke = new bke(context, str, cpp.a, this, this);
            this.f = bke;
            this.f.setMinimumWidth(dpt.f);
            this.f.setMinimumHeight(dpt.c);
            this.f.setVisibility(4);
        }
        this.i = dpt;
        this.b = str;
        this.c = context;
        this.e = cpp;
        this.d = new dio(new bim(this));
        this.Q = new cos(200);
        this.v = new dv<>();
    }

    private final void b(boolean z2) {
        if (this.f != null) {
            clq clq = this.j;
            if (clq != null && clq.b != null && this.j.b.x() != null && (!z2 || this.Q.a())) {
                if (this.j.b.x().b()) {
                    int[] iArr = new int[2];
                    this.f.getLocationOnScreen(iArr);
                    dqe.a();
                    int b2 = cpc.b(this.c, iArr[0]);
                    dqe.a();
                    int b3 = cpc.b(this.c, iArr[1]);
                    if (!(b2 == this.O && b3 == this.P)) {
                        this.O = b2;
                        this.P = b3;
                        this.j.b.x().a(this.O, this.P, !z2);
                    }
                }
                bke bke = this.f;
                if (bke != null) {
                    View findViewById = bke.getRootView().findViewById(16908290);
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
        clq clq = this.j;
        if (clq != null && clq.b != null) {
            this.j.b.destroy();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view) {
        if (((Boolean) dqe.f().a(dtg.bE)).booleanValue()) {
            dik dik = this.d.b;
            if (dik != null) {
                dik.a(view);
            }
        }
    }

    public final void a(boolean z2) {
        if (this.I == 0) {
            clq clq = this.j;
            if (!(clq == null || clq.b == null)) {
                this.j.b.stopLoading();
            }
        }
        cmg cmg = this.g;
        if (cmg != null) {
            cmg.b();
        }
        cnm cnm = this.h;
        if (cnm != null) {
            cnm.b();
        }
        if (z2) {
            this.j = null;
        }
    }

    public final void b() {
        clq clq = this.j;
        if (!(clq == null || clq.p == null)) {
            try {
                this.j.p.c();
            } catch (RemoteException unused) {
                cpn.a(5);
            }
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
}
