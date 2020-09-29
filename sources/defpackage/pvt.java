package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: pvt reason: default package */
public final class pvt implements gvk {
    private final saj b;
    private final ryz c;
    private final sfu d;
    private final gxz e;
    private final sgn f;
    private final sjc g;
    private final sjx h;

    public pvt(saj saj, ryz ryz, sfu sfu, gxz gxz, sgn sgn, sjc sjc, sjx sjx) {
        this.b = (saj) fay.a(saj);
        this.c = (ryz) fay.a(ryz);
        this.d = (sfu) fay.a(sfu);
        this.e = (gxz) fay.a(gxz);
        this.f = (sgn) fay.a(sgn);
        this.g = (sjc) fay.a(sjc);
        this.h = (sjx) fay.a(sjx);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (fax.a(string)) {
            Assertion.b("empty uri");
            return;
        }
        String a = this.g.a(string);
        this.f.a();
        this.b.a(a);
        this.c.a(this.d.a(a, guy.b));
        this.e.logInteraction(a, guy.b, "navigate-forward", null);
        this.h.a(a, "playback");
    }

    public static gzp a(String str) {
        return haa.builder().a("navigateAndSaveToHistory").a("uri", (Serializable) fay.a(str)).a();
    }
}
