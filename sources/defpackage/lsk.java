package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import java.io.Serializable;

/* renamed from: lsk reason: default package */
public final class lsk implements gvk {
    private final lse b;
    private final AssistedCurationSearchLogger c;
    private final sfx d;
    private final sgn e;

    public lsk(lse lse, AssistedCurationSearchLogger assistedCurationSearchLogger, sfx sfx, sgn sgn) {
        this.b = (lse) fay.a(lse);
        this.c = (AssistedCurationSearchLogger) fay.a(assistedCurationSearchLogger);
        this.d = (sfx) fay.a(sfx);
        this.e = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.e.a();
        this.c.a(string);
        this.b.b(string);
        this.d.a(string, gzp.data().intValue("position", -1), "add_track");
    }

    public static gzp a(String str, int i) {
        return haa.builder().a("ac:addToPlaylistFromHistory").a("uri", (Serializable) fay.a(str)).a("position", Integer.valueOf(i)).a();
    }
}
