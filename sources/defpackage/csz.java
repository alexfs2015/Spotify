package defpackage;

import android.content.Context;

/* renamed from: csz reason: default package */
final /* synthetic */ class csz implements cpb {
    private final Context a;
    private final dhx b;
    private final coy c;
    private final bki d;
    private final String e;

    csz(Context context, dhx dhx, coy coy, bki bki, String str) {
        this.a = context;
        this.b = dhx;
        this.c = coy;
        this.d = bki;
        this.e = str;
    }

    public final cpr a(Object obj) {
        Context context = this.a;
        dhx dhx = this.b;
        coy coy = this.c;
        bki bki = this.d;
        String str = this.e;
        bjl.f();
        csr a2 = csy.a(context, cue.a(), "", false, false, dhx, coy, null, null, bki, new dnh());
        cqb a3 = cqb.a(a2);
        a2.x().a((ctz) new ctb(a3));
        a2.loadUrl(str);
        return a3;
    }
}
