package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: qkc reason: default package */
public final class qkc implements gxk {
    private final Context b;
    private final jpc c;
    private final a d;
    private final has e;

    public qkc(Context context, jpc jpc, a aVar, has has) {
        this.b = context;
        this.c = jpc;
        this.d = aVar;
        this.e = has;
    }

    public static hci a(String str, String str2) {
        return hct.builder().a("freeTierContextMenu").a("uri", str).a("title", str2).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        fbp.a(gwy);
        String string = hci.data().string("uri");
        String string2 = hci.data().string("title", "");
        if (string != null) {
            sso ae_ = this.d.ae_();
            jok.a(this.c.a(string, string2, ae_.toString()).a(ae_).a(false).b(true).c(true).d(false).h(true).j(true).a(), (kf) this.b, ae_);
            this.e.logInteraction(string, gwy.b, "context-menu", null);
            return;
        }
        Assertion.b("Could not open context menu with null uri");
    }
}
