package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: qep reason: default package */
public final class qep implements gxk {
    private final skq b;
    private final sin c;
    private final sqb d;
    private final has e;
    private final squ f;
    private final stj g;
    private final sue h;

    public qep(skq skq, sin sin, sqb sqb, has has, squ squ, stj stj, sue sue) {
        this.b = (skq) fbp.a(skq);
        this.c = (sin) fbp.a(sin);
        this.d = (sqb) fbp.a(sqb);
        this.e = (has) fbp.a(has);
        this.f = (squ) fbp.a(squ);
        this.g = (stj) fbp.a(stj);
        this.h = (sue) fbp.a(sue);
    }

    public static hci a(String str) {
        return hct.builder().a("navigateAndSaveToHistory").a("uri", (Serializable) fbp.a(str)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (fbo.a(string)) {
            Assertion.b("empty uri");
            return;
        }
        String a = this.g.a(string);
        this.f.a();
        this.b.a(a);
        this.c.a(this.d.a(a, gwy.b));
        this.e.logInteraction(a, gwy.b, "navigate-forward", null);
        this.h.a(a, "playback");
    }
}
