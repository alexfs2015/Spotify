package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;

/* renamed from: mze reason: default package */
public final class mze implements gvk {
    private final hbj b;
    private final gxz c;

    public mze(hbj hbj, gxz gxz) {
        this.b = (hbj) fay.a(hbj);
        this.c = (gxz) fay.a(gxz);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string != null) {
            this.c.logInteraction(string, guy.b, "add-to-playlist", null);
            this.b.a(Collections.singletonList(string), "freetiertrack", "");
            return;
        }
        Assertion.b("URI for track cannot be null.");
    }
}
