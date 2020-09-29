package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: mvl reason: default package */
public final class mvl implements gvk {
    private final ka b;
    private final msp c;
    private final a d;
    private final gxz e;
    private final gzm f;
    private final vol g;

    public mvl(ka kaVar, msp msp, a aVar, gxz gxz, gzm gzm, vol vol) {
        this.b = (ka) fay.a(kaVar);
        this.c = (msp) fay.a(msp);
        this.d = (a) fay.a(aVar);
        this.e = (gxz) fay.a(gxz);
        this.f = (gzm) fay.a(gzm);
        this.g = (vol) fay.a(vol);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        String string2 = gzp.data().string("title", "");
        if (string != null) {
            sih ae_ = this.d.ae_();
            jly.a(this.c.a(ae_, string, string2), this.b, ae_);
            this.e.logInteraction(string, guy.b, "context-menu", null);
        } else {
            Assertion.b("Could not open context menu with null uri");
        }
        this.g.a(this.f.a(guy).a());
    }
}
