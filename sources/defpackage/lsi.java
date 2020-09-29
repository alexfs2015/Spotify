package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import java.io.Serializable;

/* renamed from: lsi reason: default package */
public final class lsi implements gvk {
    private final lse b;
    private final AssistedCurationSearchLogger c;
    private final sgn d;

    public lsi(lse lse, AssistedCurationSearchLogger assistedCurationSearchLogger, sgn sgn) {
        this.b = (lse) fay.a(lse);
        this.c = (AssistedCurationSearchLogger) fay.a(assistedCurationSearchLogger);
        this.d = (sgn) fay.a(sgn);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.d.a();
        this.c.a(string);
        this.b.b(string);
    }

    public static gzp a(String str) {
        return haa.builder().a("ac:addToPlaylist").a("uri", (Serializable) fay.a(str)).a();
    }
}
