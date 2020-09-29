package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: pwd reason: default package */
public final class pwd implements gvk {
    private final saj b;
    private final sfx c;
    private final sgn d;
    private final sjc e;
    private final sjx f;

    public pwd(saj saj, sfx sfx, sgn sgn, sjc sjc, sjx sjx) {
        this.b = (saj) fay.a(saj);
        this.c = (sfx) fay.a(sfx);
        this.d = (sgn) fay.a(sgn);
        this.e = (sjc) fay.a(sjc);
        this.f = (sjx) fay.a(sjx);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("targetUri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        String str = "playback";
        String str2 = "position";
        if (ViewUris.u.b(string)) {
            String a = this.e.a(string);
            this.d.a();
            this.b.d(a);
            this.c.a(a, gzp.data().intValue(str2, -1));
            this.f.a(a, str);
            return;
        }
        String a2 = this.e.a(string);
        this.d.a();
        this.b.a(a2);
        this.c.a(a2, gzp.data().intValue(str2, -1));
        this.f.a(a2, str);
    }

    public static gzp a(String str, String str2, int i) {
        return haa.builder().a("openHistoryItem").a("targetUri", str).a("uri", str2).a("position", Integer.valueOf(i)).a();
    }
}
