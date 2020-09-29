package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: qen reason: default package */
public final class qen implements gxk {
    private final sqw b;
    private final sin c;
    private final sqb d;
    private final has e;
    private final squ f;

    public qen(sqw sqw, sin sin, sqb sqb, has has, squ squ) {
        this.b = (sqw) fbp.a(sqw);
        this.c = (sin) fbp.a(sin);
        this.d = (sqb) fbp.a(sqb);
        this.e = (has) fbp.a(has);
        this.f = (squ) fbp.a(squ);
    }

    public static hci a(String str) {
        return hct.builder().a("launchRadioAndSaveToHistory").a("uri", (Serializable) fbp.a(str)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (fbo.a(string)) {
            Assertion.b("empty uri");
            return;
        }
        this.f.a();
        this.b.a(string, (String) jvi.a(gwy.b.text().title(), ""));
        this.c.a(this.d.a(string, gwy.b));
        this.e.logInteraction(string, gwy.b, "navigate-forward", null);
    }
}
