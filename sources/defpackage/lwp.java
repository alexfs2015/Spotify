package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;

/* renamed from: lwp reason: default package */
public final class lwp implements gxk {
    private final lwd b;
    private final sqe c;
    private final squ d;

    public lwp(lwd lwd, sqe sqe, squ squ) {
        this.b = (lwd) fbp.a(lwd);
        this.c = (sqe) fbp.a(sqe);
        this.d = (squ) fbp.a(squ);
    }

    public static hci a(String str, int i) {
        return hct.builder().a("ac:navigateFromHistory").a("uri", (Serializable) fbp.a(str)).a("position", Integer.valueOf(i)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        this.d.a();
        this.b.a(string, (String) fbp.a(gwy.b.text().title()));
        this.c.a(string, hci.data().intValue("position", -1));
    }
}
