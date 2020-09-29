package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: lwn reason: default package */
public final class lwn implements gxk {
    private final lwd b;
    private final has c;
    private final squ d;

    public lwn(lwd lwd, has has, squ squ) {
        this.b = (lwd) fbp.a(lwd);
        this.c = (has) fbp.a(has);
        this.d = (squ) fbp.a(squ);
    }

    public static hci a(String str) {
        return hct.builder().a("ac:navigate").a("uri", (Serializable) fbp.a(str)).a();
    }

    public static hci a(String str, String str2) {
        return hct.builder().a("ac:navigate").a("uri", (Serializable) fbp.a(str)).a("title", (Serializable) fbp.a(str2)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.d.a();
        String string2 = hci.data().string("title");
        if (string2 == null) {
            string2 = (String) fbp.a(gwy.b.text().title());
        }
        this.b.a(string, string2);
        this.c.logInteraction(string, gwy.b, "navigate-forward", null);
    }
}
