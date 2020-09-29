package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import java.io.Serializable;

/* renamed from: lwf reason: default package */
public final class lwf implements gxk {
    private final lwd b;
    private final AssistedCurationSearchLogger c;
    private final sin d;
    private final sqb e;
    private final squ f;

    public lwf(lwd lwd, AssistedCurationSearchLogger assistedCurationSearchLogger, sin sin, sqb sqb, squ squ) {
        this.b = (lwd) fbp.a(lwd);
        this.c = (AssistedCurationSearchLogger) fbp.a(assistedCurationSearchLogger);
        this.d = (sin) fbp.a(sin);
        this.e = (sqb) fbp.a(sqb);
        this.f = (squ) fbp.a(squ);
    }

    public static hci a(String str) {
        return hct.builder().a("ac:addToPlaylistAndSaveToHistory").a("uri", (Serializable) fbp.a(str)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.f.a();
        this.c.a(string);
        this.b.b(string);
        this.d.a(this.e.a(string, gwy.b));
    }
}
