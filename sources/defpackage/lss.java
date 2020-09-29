package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.Serializable;

/* renamed from: lss reason: default package */
public final class lss implements gvk {
    private final sgn b;
    private final txc c;
    private final gyj d;

    public lss(sgn sgn, txc txc, gyj gyj) {
        this.b = (sgn) fay.a(sgn);
        this.c = (txc) fay.a(txc);
        this.d = (gyj) fay.a(gyj);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("previewId");
        if (fax.a(string)) {
            Logger.e("Missing previewId", new Object[0]);
        } else {
            if (this.d.a(gzp.data().boolValue("isExplicit", false))) {
                this.d.a((String) fay.a(gzp.data().string("uri")), null);
                return;
            }
            this.c.b(string, (String) jtc.a(gzp.data().string("previewKey"), ""));
        }
        this.b.a();
    }

    public static gzp a(String str, String str2, String str3, boolean z) {
        return haa.builder().a("ac:preview").a("uri", (Serializable) fay.a(str)).a("previewId", (Serializable) fay.a(str2)).a("previewKey", (Serializable) fay.a(str3)).a("isExplicit", Boolean.valueOf(z)).a();
    }
}
