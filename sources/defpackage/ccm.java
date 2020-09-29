package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.Set;

@cfp
/* renamed from: ccm reason: default package */
public final class ccm extends ccv {
    public String a = "top-right";
    public boolean b = true;
    public int c = -1;
    public int d = 0;
    public int e = 0;
    public int f = -1;
    public final Object g = new Object();
    public final cti h;
    public final Activity i;
    public cuv j;
    public ImageView k;
    public LinearLayout l;
    public ccw m;
    public PopupWindow n;
    public RelativeLayout o;
    public ViewGroup p;
    private int r = 0;
    private int s = 0;

    static {
        String[] strArr = {"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"};
        Set a2 = bzy.a(7, false);
        Collections.addAll(a2, strArr);
        Collections.unmodifiableSet(a2);
    }

    public ccm(cti cti, ccw ccw) {
        super(cti, "resize");
        this.h = cti;
        this.i = cti.d();
        this.m = ccw;
    }

    public final void a(int i2, int i3) {
        bkc.e();
        a(i2, i3 - cmu.c(this.i)[0], this.f, this.c);
    }

    public final void a(int i2, int i3, boolean z) {
        synchronized (this.g) {
            this.r = i2;
            this.s = i3;
            if (this.n != null && z) {
                int[] a2 = a();
                if (a2 != null) {
                    PopupWindow popupWindow = this.n;
                    dqe.a();
                    int a3 = cpc.a((Context) this.i, a2[0]);
                    dqe.a();
                    popupWindow.update(a3, cpc.a((Context) this.i, a2[1]), this.n.getWidth(), this.n.getHeight());
                    a(a2[0], a2[1]);
                } else {
                    a(true);
                }
            }
        }
    }

    public final void a(boolean z) {
        synchronized (this.g) {
            if (this.n != null) {
                this.n.dismiss();
                this.o.removeView(this.h.o());
                if (this.p != null) {
                    this.p.removeView(this.k);
                    this.p.addView(this.h.o());
                    this.h.a(this.j);
                }
                if (z) {
                    b("default");
                    if (this.m != null) {
                        this.m.O();
                    }
                }
                this.n = null;
                this.o = null;
                this.p = null;
                this.l = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] a() {
        /*
            r12 = this;
            defpackage.bkc.e()
            android.app.Activity r0 = r12.i
            int[] r0 = defpackage.cmu.b(r0)
            defpackage.bkc.e()
            android.app.Activity r1 = r12.i
            int[] r1 = defpackage.cmu.c(r1)
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r0 = r0[r4]
            int r5 = r12.f
            r6 = 5
            r7 = 2
            r8 = 50
            if (r5 < r8) goto L_0x00fb
            if (r5 <= r3) goto L_0x0024
            goto L_0x00fb
        L_0x0024:
            int r9 = r12.c
            if (r9 < r8) goto L_0x00f7
            if (r9 <= r0) goto L_0x002c
            goto L_0x00f7
        L_0x002c:
            if (r9 != r0) goto L_0x0035
            if (r5 != r3) goto L_0x0035
            defpackage.cpn.a(r6)
            goto L_0x00fe
        L_0x0035:
            boolean r0 = r12.b
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = r12.a
            r5 = -1
            int r9 = r0.hashCode()
            r10 = 4
            r11 = 3
            switch(r9) {
                case -1364013995: goto L_0x0078;
                case -1012429441: goto L_0x006e;
                case -655373719: goto L_0x0064;
                case 1163912186: goto L_0x005a;
                case 1288627767: goto L_0x0050;
                case 1755462605: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0081
        L_0x0046:
            java.lang.String r9 = "top-center"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0081
            r5 = 1
            goto L_0x0081
        L_0x0050:
            java.lang.String r9 = "bottom-center"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0081
            r5 = 4
            goto L_0x0081
        L_0x005a:
            java.lang.String r9 = "bottom-right"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0081
            r5 = 5
            goto L_0x0081
        L_0x0064:
            java.lang.String r9 = "bottom-left"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0081
            r5 = 3
            goto L_0x0081
        L_0x006e:
            java.lang.String r9 = "top-left"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0081
            r5 = 0
            goto L_0x0081
        L_0x0078:
            java.lang.String r9 = "center"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0081
            r5 = 2
        L_0x0081:
            if (r5 == 0) goto L_0x00e0
            if (r5 == r4) goto L_0x00d4
            if (r5 == r7) goto L_0x00bd
            if (r5 == r11) goto L_0x00ae
            int r0 = r12.r
            if (r5 == r10) goto L_0x00a4
            if (r5 == r6) goto L_0x009c
            int r5 = r12.d
            int r0 = r0 + r5
            int r5 = r12.f
            int r0 = r0 + r5
            int r0 = r0 - r8
        L_0x0096:
            int r5 = r12.s
            int r6 = r12.e
            int r5 = r5 + r6
            goto L_0x00e6
        L_0x009c:
            int r5 = r12.d
            int r0 = r0 + r5
            int r5 = r12.f
            int r0 = r0 + r5
            int r0 = r0 - r8
            goto L_0x00b3
        L_0x00a4:
            int r5 = r12.d
            int r0 = r0 + r5
            int r5 = r12.f
            int r5 = r5 / r7
            int r0 = r0 + r5
            int r0 = r0 + -25
            goto L_0x00b3
        L_0x00ae:
            int r0 = r12.r
            int r5 = r12.d
            int r0 = r0 + r5
        L_0x00b3:
            int r5 = r12.s
            int r6 = r12.e
            int r5 = r5 + r6
            int r6 = r12.c
            int r5 = r5 + r6
            int r5 = r5 - r8
            goto L_0x00e6
        L_0x00bd:
            int r0 = r12.r
            int r5 = r12.d
            int r0 = r0 + r5
            int r5 = r12.f
            int r5 = r5 / r7
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r12.s
            int r6 = r12.e
            int r5 = r5 + r6
            int r6 = r12.c
            int r6 = r6 / r7
            int r5 = r5 + r6
            int r5 = r5 + -25
            goto L_0x00e6
        L_0x00d4:
            int r0 = r12.r
            int r5 = r12.d
            int r0 = r0 + r5
            int r5 = r12.f
            int r5 = r5 / r7
            int r0 = r0 + r5
            int r0 = r0 + -25
            goto L_0x0096
        L_0x00e0:
            int r0 = r12.r
            int r5 = r12.d
            int r0 = r0 + r5
            goto L_0x0096
        L_0x00e6:
            if (r0 < 0) goto L_0x00fe
            int r0 = r0 + r8
            if (r0 > r3) goto L_0x00fe
            r0 = r1[r2]
            if (r5 < r0) goto L_0x00fe
            int r5 = r5 + r8
            r0 = r1[r4]
            if (r5 <= r0) goto L_0x00f5
            goto L_0x00fe
        L_0x00f5:
            r0 = 1
            goto L_0x00ff
        L_0x00f7:
            defpackage.cpn.a(r6)
            goto L_0x00fe
        L_0x00fb:
            defpackage.cpn.a(r6)
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            if (r0 != 0) goto L_0x0103
            r0 = 0
            return r0
        L_0x0103:
            boolean r0 = r12.b
            if (r0 == 0) goto L_0x0118
            int[] r0 = new int[r7]
            int r1 = r12.r
            int r3 = r12.d
            int r1 = r1 + r3
            r0[r2] = r1
            int r1 = r12.s
            int r2 = r12.e
            int r1 = r1 + r2
            r0[r4] = r1
            return r0
        L_0x0118:
            defpackage.bkc.e()
            android.app.Activity r0 = r12.i
            int[] r0 = defpackage.cmu.b(r0)
            defpackage.bkc.e()
            android.app.Activity r1 = r12.i
            int[] r1 = defpackage.cmu.c(r1)
            r0 = r0[r2]
            int r3 = r12.r
            int r5 = r12.d
            int r3 = r3 + r5
            int r5 = r12.s
            int r6 = r12.e
            int r5 = r5 + r6
            if (r3 >= 0) goto L_0x013a
            r0 = 0
            goto L_0x0143
        L_0x013a:
            int r6 = r12.f
            int r8 = r3 + r6
            if (r8 <= r0) goto L_0x0142
            int r0 = r0 - r6
            goto L_0x0143
        L_0x0142:
            r0 = r3
        L_0x0143:
            r3 = r1[r2]
            if (r5 >= r3) goto L_0x014a
            r5 = r1[r2]
            goto L_0x0156
        L_0x014a:
            int r3 = r12.c
            int r6 = r5 + r3
            r8 = r1[r4]
            if (r6 <= r8) goto L_0x0156
            r1 = r1[r4]
            int r5 = r1 - r3
        L_0x0156:
            int[] r1 = new int[r7]
            r1[r2] = r0
            r1[r4] = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccm.a():int[]");
    }

    public final void b(int i2, int i3) {
        this.r = i2;
        this.s = i3;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.n != null;
        }
        return z;
    }
}
