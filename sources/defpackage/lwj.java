package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import java.io.Serializable;

/* renamed from: lwj reason: default package */
public final class lwj implements gxk {
    private final lwd b;
    private final AssistedCurationSearchLogger c;
    private final sqe d;
    private final squ e;

    public lwj(lwd lwd, AssistedCurationSearchLogger assistedCurationSearchLogger, sqe sqe, squ squ) {
        this.b = (lwd) fbp.a(lwd);
        this.c = (AssistedCurationSearchLogger) fbp.a(assistedCurationSearchLogger);
        this.d = (sqe) fbp.a(sqe);
        this.e = (squ) fbp.a(squ);
    }

    public static hci a(String str, int i) {
        return hct.builder().a("ac:addToPlaylistFromHistory").a("uri", (Serializable) fbp.a(str)).a("position", Integer.valueOf(i)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.e.a();
        this.c.a(string);
        this.b.b(string);
        this.d.a(string, hci.data().intValue("position", -1), "add_track");
    }
}
