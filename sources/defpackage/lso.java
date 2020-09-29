package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: lso reason: default package */
public final class lso implements gvk {
    private final lse b;
    private final gxz c;
    private final sgn d;

    public lso(lse lse, gxz gxz, sgn sgn) {
        this.b = (lse) fay.a(lse);
        this.c = (gxz) fay.a(gxz);
        this.d = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.d.a();
        String string2 = gzp.data().string("title");
        if (string2 == null) {
            string2 = (String) fay.a(guy.b.text().title());
        }
        this.b.a(string, string2);
        this.c.logInteraction(string, guy.b, "navigate-forward", null);
    }

    public static gzp a(String str) {
        return haa.builder().a("ac:navigate").a("uri", (Serializable) fay.a(str)).a();
    }

    public static gzp a(String str, String str2) {
        return haa.builder().a("ac:navigate").a("uri", (Serializable) fay.a(str)).a("title", (Serializable) fay.a(str2)).a();
    }
}
