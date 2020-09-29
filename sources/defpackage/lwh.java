package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import java.io.Serializable;

/* renamed from: lwh reason: default package */
public final class lwh implements gxk {
    private final lwd b;
    private final AssistedCurationSearchLogger c;
    private final squ d;

    public lwh(lwd lwd, AssistedCurationSearchLogger assistedCurationSearchLogger, squ squ) {
        this.b = (lwd) fbp.a(lwd);
        this.c = (AssistedCurationSearchLogger) fbp.a(assistedCurationSearchLogger);
        this.d = (squ) fbp.a(squ);
    }

    public static hci a(String str) {
        return hct.builder().a("ac:addToPlaylist").a("uri", (Serializable) fbp.a(str)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.d.a();
        this.c.a(string);
        this.b.b(string);
    }
}
