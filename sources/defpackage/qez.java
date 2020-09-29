package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qez reason: default package */
public final class qez implements gxk {
    private final skq b;
    private final sqe c;
    private final squ d;
    private final stj e;
    private final sue f;

    public qez(skq skq, sqe sqe, squ squ, stj stj, sue sue) {
        this.b = (skq) fbp.a(skq);
        this.c = (sqe) fbp.a(sqe);
        this.d = (squ) fbp.a(squ);
        this.e = (stj) fbp.a(stj);
        this.f = (sue) fbp.a(sue);
    }

    public static hci a(String str, String str2, int i) {
        return hct.builder().a("openHistoryItem").a("targetUri", str).a("uri", str2).a("position", Integer.valueOf(i)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("targetUri");
        if (string == null) {
            Assertion.b("empty uri");
            return;
        }
        String str = "playback";
        String str2 = "position";
        if (ViewUris.t.b(string)) {
            String a = this.e.a(string);
            this.d.a();
            this.b.d(a);
            this.c.a(a, hci.data().intValue(str2, -1));
            this.f.a(a, str);
            return;
        }
        String a2 = this.e.a(string);
        this.d.a();
        this.b.a(a2);
        this.c.a(a2, hci.data().intValue(str2, -1));
        this.f.a(a2, str);
    }
}
