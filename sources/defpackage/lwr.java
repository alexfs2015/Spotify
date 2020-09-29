package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.Serializable;

/* renamed from: lwr reason: default package */
public final class lwr implements gxk {
    private final squ b;
    private final ujf c;
    private final hbc d;

    public lwr(squ squ, ujf ujf, hbc hbc) {
        this.b = (squ) fbp.a(squ);
        this.c = (ujf) fbp.a(ujf);
        this.d = (hbc) fbp.a(hbc);
    }

    public static hci a(String str, String str2, String str3, boolean z) {
        return hct.builder().a("ac:preview").a("uri", (Serializable) fbp.a(str)).a("previewId", (Serializable) fbp.a(str2)).a("previewKey", (Serializable) fbp.a(str3)).a("isExplicit", Boolean.valueOf(z)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("previewId");
        if (fbo.a(string)) {
            Logger.e("Missing previewId", new Object[0]);
        } else {
            if (this.d.a(hci.data().boolValue("isExplicit", false))) {
                this.d.a((String) fbp.a(hci.data().string("uri")), null);
                return;
            }
            this.c.b(string, (String) jvi.a(hci.data().string("previewKey"), ""));
        }
        this.b.a();
    }
}
