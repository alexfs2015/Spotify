package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: lsm reason: default package */
public final class lsm implements gvk {
    private final lse b;
    private final gxz c;
    private final ryz d;
    private final sfu e;
    private final sgn f;

    public lsm(lse lse, gxz gxz, ryz ryz, sfu sfu, sgn sgn) {
        this.b = (lse) fay.a(lse);
        this.c = (gxz) fay.a(gxz);
        this.d = (ryz) fay.a(ryz);
        this.e = (sfu) fay.a(sfu);
        this.f = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.f.a();
        this.b.a(string, (String) fay.a(guy.b.text().title()));
        this.c.logInteraction(string, guy.b, "navigate-forward", null);
        this.d.a(this.e.a(string, guy.b));
    }

    public static gzp a(String str) {
        return haa.builder().a("ac:navigateAndSaveToHistory").a("uri", (Serializable) fay.a(str)).a();
    }
}
