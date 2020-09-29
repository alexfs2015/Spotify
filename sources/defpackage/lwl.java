package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: lwl reason: default package */
public final class lwl implements gxk {
    private final lwd b;
    private final has c;
    private final sin d;
    private final sqb e;
    private final squ f;

    public lwl(lwd lwd, has has, sin sin, sqb sqb, squ squ) {
        this.b = (lwd) fbp.a(lwd);
        this.c = (has) fbp.a(has);
        this.d = (sin) fbp.a(sin);
        this.e = (sqb) fbp.a(sqb);
        this.f = (squ) fbp.a(squ);
    }

    public static hci a(String str) {
        return hct.builder().a("ac:navigateAndSaveToHistory").a("uri", (Serializable) fbp.a(str)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.f.a();
        this.b.a(string, (String) fbp.a(gwy.b.text().title()));
        this.c.logInteraction(string, gwy.b, "navigate-forward", null);
        this.d.a(this.e.a(string, gwy.b));
    }
}
