package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: pwf reason: default package */
public final class pwf implements gvk {
    private final ryz b;
    private final sfx c;
    private final sgn d;

    public pwf(ryz ryz, sfx sfx, sgn sgn) {
        this.b = (ryz) fay.a(ryz);
        this.c = (sfx) fay.a(sfx);
        this.d = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            Assertion.b("empty recent search");
            return;
        }
        this.d.a();
        this.b.a(string);
        this.c.b(string, gzp.data().intValue("position", -1));
    }

    public static gzp a(String str, int i) {
        return haa.builder().a("removeHistoryItem").a("uri", str).a("position", Integer.valueOf(i)).a();
    }
}
