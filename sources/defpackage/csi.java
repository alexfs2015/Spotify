package defpackage;

import android.content.Context;
import android.text.TextUtils;

@cfp
/* renamed from: csi reason: default package */
public final class csi {
    final Context a;
    final String b;
    final cpp c;
    final dtr d;
    final dtt e;
    final cnz f = new cnz(new cob().a("min_1", Double.MIN_VALUE, 1.0d).a("1_5", 1.0d, 5.0d).a("5_10", 5.0d, 10.0d).a("10_20", 10.0d, 20.0d).a("20_30", 20.0d, 30.0d).a("30_max", 30.0d, Double.MAX_VALUE), 0);
    final long[] g;
    final String[] h;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m;
    crr n;
    boolean o;
    boolean p;
    long q = -1;

    public csi(Context context, cpp cpp, String str, dtt dtt, dtr dtr) {
        this.a = context;
        this.c = cpp;
        this.b = str;
        this.e = dtt;
        this.d = dtr;
        String str2 = (String) dqe.f().a(dtg.u);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.h = new String[split.length];
        this.g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                cpn.a(5);
                this.g[i2] = -1;
            }
        }
    }

    public final void a() {
        this.m = true;
        if (this.j && !this.k) {
            dtm.a(this.e, this.d, "vfp2");
            this.k = true;
        }
    }
}
