package defpackage;

import java.nio.charset.Charset;

/* renamed from: pyv reason: default package */
public final class pyv implements sfw {
    private final jrp a;
    private final jjf b;
    private final udr c;

    public pyv(jjf jjf, udr udr, jrp jrp) {
        this.b = (jjf) fay.a(jjf);
        this.c = (udr) fay.a(udr);
        this.a = (jrp) fay.a(jrp);
    }

    public final void a(String str, String str2, int i) {
        jjf jjf = this.b;
        bh bhVar = new bh((String) fay.a(str), ((udr) fay.a(this.c)).a(), "spotify:search-autocomplete", null, (long) i, String.format("spotify:search:%s", new Object[]{gbm.a(str2, Charset.defaultCharset())}), "TAP", "AUTOCOMPLETE", (double) this.a.a());
        jjf.a(bhVar);
    }

    public final void a(String str, int i) {
        jjf jjf = this.b;
        bh bhVar = new bh((String) fay.a(str), ((udr) fay.a(this.c)).a(), "spotify:search-autocomplete", null, (long) i, null, "TAP", "FILL", (double) this.a.a());
        jjf.a(bhVar);
    }

    public final void a(String str) {
        jjf jjf = this.b;
        bh bhVar = new bh((String) fay.a(str), ((udr) fay.a(this.c)).a(), "spotify:search-autocomplete", null, 0, null, "KEYBOARD", "SEARCH", (double) this.a.a());
        jjf.a(bhVar);
    }

    public final void b(String str) {
        jjf jjf = this.b;
        bh bhVar = new bh((String) fay.a(str), ((udr) fay.a(this.c)).a(), "spotify:search-autocomplete", null, 0, null, "TAP", "clear", (double) this.a.a());
        jjf.a(bhVar);
    }
}
