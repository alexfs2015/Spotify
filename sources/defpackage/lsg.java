package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import java.io.Serializable;

/* renamed from: lsg reason: default package */
public final class lsg implements gvk {
    private final lse b;
    private final AssistedCurationSearchLogger c;
    private final ryz d;
    private final sfu e;
    private final sgn f;

    public lsg(lse lse, AssistedCurationSearchLogger assistedCurationSearchLogger, ryz ryz, sfu sfu, sgn sgn) {
        this.b = (lse) fay.a(lse);
        this.c = (AssistedCurationSearchLogger) fay.a(assistedCurationSearchLogger);
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
        this.c.a(string);
        this.b.b(string);
        this.d.a(this.e.a(string, guy.b));
    }

    public static gzp a(String str) {
        return haa.builder().a("ac:addToPlaylistAndSaveToHistory").a("uri", (Serializable) fay.a(str)).a();
    }
}
