package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gvx reason: default package */
public final class gvx implements gvk {
    private final Context b;
    private final jnv c;
    private final a d;
    private final gxz e;
    private final gzm f;
    private final vol g;

    public gvx(Context context, jnv jnv, a aVar, gxz gxz, gzm gzm, vol vol) {
        this.b = (Context) fay.a(context);
        this.c = (jnv) fay.a(jnv);
        this.d = aVar;
        this.e = (gxz) fay.a(gxz);
        this.f = gzm;
        this.g = vol;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        String string2 = gzp.data().string("title", "");
        if (string != null) {
            sih ae_ = this.d.ae_();
            jly.a(this.c.a(ae_, string, string2), (ka) this.b, ae_);
            this.e.logInteraction(string, guy.b, "context-menu", null);
        } else {
            Assertion.b("Could not open context menu with null uri");
        }
        this.g.a(this.f.a(guy).a());
    }

    public static gzp a(String str, String str2) {
        return haa.builder().a("contextMenu").a("uri", str).a("title", str2).a();
    }
}
