package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;

/* renamed from: nel reason: default package */
public final class nel implements gxk {
    private final hec b;
    private final has c;

    public nel(hec hec, has has) {
        this.b = (hec) fbp.a(hec);
        this.c = (has) fbp.a(has);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string != null) {
            this.c.logInteraction(string, gwy.b, "add-to-playlist", null);
            this.b.a(Collections.singletonList(string), "freetiertrack", "");
            return;
        }
        Assertion.b("URI for track cannot be null.");
    }
}
