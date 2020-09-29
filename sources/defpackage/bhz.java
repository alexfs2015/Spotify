package defpackage;

import android.content.Context;
import android.text.TextUtils;

@cey
/* renamed from: bhz reason: default package */
public final class bhz extends dpz {
    private dps a;
    private dwa b;
    private dwp c;
    private dwd d;
    private dv<String, dwh> e = new dv<>();
    private dv<String, dwk> f = new dv<>();
    private dwn g;
    private dpc h;
    private bfe i;
    private dup j;
    private dqs k;
    private final Context l;
    private final ecp m;
    private final String n;
    private final coy o;
    private final bki p;

    public bhz(Context context, String str, ecp ecp, coy coy, bki bki) {
        this.l = context;
        this.n = str;
        this.m = ecp;
        this.o = coy;
        this.p = bki;
    }

    public final dpv a() {
        bhw bhw = new bhw(this.l, this.n, this.m, this.o, this.a, this.b, this.c, this.d, this.f, this.e, this.j, this.k, this.p, this.g, this.h, this.i);
        return bhw;
    }

    public final void a(bfe bfe) {
        this.i = bfe;
    }

    public final void a(dps dps) {
        this.a = dps;
    }

    public final void a(dqs dqs) {
        this.k = dqs;
    }

    public final void a(dup dup) {
        this.j = dup;
    }

    public final void a(dwa dwa) {
        this.b = dwa;
    }

    public final void a(dwd dwd) {
        this.d = dwd;
    }

    public final void a(dwn dwn, dpc dpc) {
        this.g = dwn;
        this.h = dpc;
    }

    public final void a(dwp dwp) {
        this.c = dwp;
    }

    public final void a(String str, dwk dwk, dwh dwh) {
        if (!TextUtils.isEmpty(str)) {
            this.f.put(str, dwk);
            this.e.put(str, dwh);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
}
