package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gxy reason: default package */
public final class gxy implements gxk {
    private final Context b;
    private final jqh c;
    private final a d;
    private final has e;
    private final hcf f;
    private final wbt g;

    public gxy(Context context, jqh jqh, a aVar, has has, hcf hcf, wbt wbt) {
        this.b = (Context) fbp.a(context);
        this.c = (jqh) fbp.a(jqh);
        this.d = aVar;
        this.e = (has) fbp.a(has);
        this.f = hcf;
        this.g = wbt;
    }

    public static hci a(String str, String str2) {
        return hct.builder().a("contextMenu").a("uri", str).a("title", str2).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        String string2 = hci.data().string("title", "");
        if (string != null) {
            sso ae_ = this.d.ae_();
            jok.a(this.c.a(ae_, string, string2), (kf) this.b, ae_);
            this.e.logInteraction(string, gwy.b, "context-menu", null);
        } else {
            Assertion.b("Could not open context menu with null uri");
        }
        this.g.a(this.f.a(gwy).a());
    }
}
