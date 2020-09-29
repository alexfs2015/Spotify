package defpackage;

import java.nio.charset.Charset;

/* renamed from: upg reason: default package */
public final class upg implements upi {
    private final jrp a;
    private final jjf b;
    private final udr c;

    public upg(jjf jjf, udr udr, jrp jrp) {
        this.b = (jjf) fay.a(jjf);
        this.c = (udr) fay.a(udr);
        this.a = (jrp) fay.a(jrp);
    }

    public final void a(String str, int i) {
        jjf jjf = this.b;
        String str2 = "spotify:search-trending";
        String str3 = "hit";
        String str4 = "fill";
        bh bhVar = new bh(null, ((udr) fay.a(this.c)).a(), str2, null, (long) i, String.format("spotify:search:%s", new Object[]{gbm.a(str, Charset.defaultCharset())}), str3, str4, (double) this.a.a());
        jjf.a(bhVar);
    }
}
