package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: qbe reason: default package */
public final class qbe implements gvk {
    private final Context b;
    private final jmq c;
    private final a d;
    private final gxz e;

    public qbe(Context context, jmq jmq, a aVar, gxz gxz) {
        this.b = context;
        this.c = jmq;
        this.d = aVar;
        this.e = gxz;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        fay.a(guy);
        String string = gzp.data().string("uri");
        String string2 = gzp.data().string("title", "");
        if (string != null) {
            sih ae_ = this.d.ae_();
            jly.a(this.c.a(string, string2, ae_.toString()).a(ae_).a(false).b(true).c(true).d(false).h(true).j(true).a(), (ka) this.b, ae_);
            this.e.logInteraction(string, guy.b, "context-menu", null);
            return;
        }
        Assertion.b("Could not open context menu with null uri");
    }

    public static gzp a(String str, String str2) {
        return haa.builder().a("freeTierContextMenu").a("uri", str).a("title", str2).a();
    }
}
