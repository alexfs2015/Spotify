package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: lsq reason: default package */
public final class lsq implements gvk {
    private final lse b;
    private final sfx c;
    private final sgn d;

    public lsq(lse lse, sfx sfx, sgn sgn) {
        this.b = (lse) fay.a(lse);
        this.c = (sfx) fay.a(sfx);
        this.d = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.d.a();
        this.b.a(string, (String) fay.a(guy.b.text().title()));
        this.c.a(string, gzp.data().intValue("position", -1));
    }

    public static gzp a(String str, int i) {
        return haa.builder().a("ac:navigateFromHistory").a("uri", (Serializable) fay.a(str)).a("position", Integer.valueOf(i)).a();
    }
}
