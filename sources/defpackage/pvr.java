package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: pvr reason: default package */
public final class pvr implements gvk {
    private final sgp b;
    private final ryz c;
    private final sfu d;
    private final gxz e;
    private final sgn f;

    public pvr(sgp sgp, ryz ryz, sfu sfu, gxz gxz, sgn sgn) {
        this.b = (sgp) fay.a(sgp);
        this.c = (ryz) fay.a(ryz);
        this.d = (sfu) fay.a(sfu);
        this.e = (gxz) fay.a(gxz);
        this.f = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (fax.a(string)) {
            Assertion.b("empty uri");
            return;
        }
        this.f.a();
        this.b.a(string, (String) jtc.a(guy.b.text().title(), ""));
        this.c.a(this.d.a(string, guy.b));
        this.e.logInteraction(string, guy.b, "navigate-forward", null);
    }

    public static gzp a(String str) {
        return haa.builder().a("launchRadioAndSaveToHistory").a("uri", (Serializable) fay.a(str)).a();
    }
}
