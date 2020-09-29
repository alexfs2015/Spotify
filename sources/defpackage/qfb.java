package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: qfb reason: default package */
public final class qfb implements gxk {
    private final sin b;
    private final sqe c;
    private final squ d;

    public qfb(sin sin, sqe sqe, squ squ) {
        this.b = (sin) fbp.a(sin);
        this.c = (sqe) fbp.a(sqe);
        this.d = (squ) fbp.a(squ);
    }

    public static hci a(String str, int i) {
        return hct.builder().a("removeHistoryItem").a("uri", str).a("position", Integer.valueOf(i)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            Assertion.b("empty recent search");
            return;
        }
        this.d.a();
        this.b.a(string);
        this.c.b(string, hci.data().intValue("position", -1));
    }
}
