package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: nam reason: default package */
public final class nam implements gxk {
    private final kf b;
    private final mxq c;
    private final a d;
    private final has e;
    private final hcf f;
    private final wbt g;

    public nam(kf kfVar, mxq mxq, a aVar, has has, hcf hcf, wbt wbt) {
        this.b = (kf) fbp.a(kfVar);
        this.c = (mxq) fbp.a(mxq);
        this.d = (a) fbp.a(aVar);
        this.e = (has) fbp.a(has);
        this.f = (hcf) fbp.a(hcf);
        this.g = (wbt) fbp.a(wbt);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        String string2 = hci.data().string("title", "");
        if (string != null) {
            sso ae_ = this.d.ae_();
            jok.a(this.c.a(ae_, string, string2), this.b, ae_);
            this.e.logInteraction(string, gwy.b, "context-menu", null);
        } else {
            Assertion.b("Could not open context menu with null uri");
        }
        this.g.a(this.f.a(gwy).a());
    }
}
