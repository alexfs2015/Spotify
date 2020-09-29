package defpackage;

import android.content.Context;

@cfp
/* renamed from: cgi reason: default package */
public final class cgi extends cgf {
    private final Context a;

    public cgi(Context context, cqv<cgl> cqv, cgd cgd) {
        super(cqv, cgd);
        this.a = context;
    }

    public final void a() {
    }

    public final cgt d() {
        Context context = this.a;
        bkc.C().a(context);
        civ civ = new civ(context);
        cht cht = new cht(new dnw(), new clm(), new dst(), new cin(context, civ.b()), new ecn(), new cit(), new ciu(), new cde(), new cln(), civ);
        return chu.a(context, cht);
    }
}
