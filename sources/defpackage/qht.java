package defpackage;

import java.nio.charset.Charset;

/* renamed from: qht reason: default package */
public final class qht implements sqd {
    private final jtz a;
    private final jlr b;
    private final uqm c;

    public qht(jlr jlr, uqm uqm, jtz jtz) {
        this.b = (jlr) fbp.a(jlr);
        this.c = (uqm) fbp.a(uqm);
        this.a = (jtz) fbp.a(jtz);
    }

    public final void a(String str) {
        jlr jlr = this.b;
        bg bgVar = new bg((String) fbp.a(str), ((uqm) fbp.a(this.c)).a(), "spotify:search-autocomplete", null, 0, null, "KEYBOARD", "SEARCH", (double) this.a.a());
        jlr.a(bgVar);
    }

    public final void a(String str, int i) {
        jlr jlr = this.b;
        bg bgVar = new bg((String) fbp.a(str), ((uqm) fbp.a(this.c)).a(), "spotify:search-autocomplete", null, (long) i, null, "TAP", "FILL", (double) this.a.a());
        jlr.a(bgVar);
    }

    public final void a(String str, String str2, int i) {
        jlr jlr = this.b;
        bg bgVar = new bg((String) fbp.a(str), ((uqm) fbp.a(this.c)).a(), "spotify:search-autocomplete", null, (long) i, String.format("spotify:search:%s", new Object[]{gck.a(str2, Charset.defaultCharset())}), "TAP", "AUTOCOMPLETE", (double) this.a.a());
        jlr.a(bgVar);
    }

    public final void b(String str) {
        jlr jlr = this.b;
        bg bgVar = new bg((String) fbp.a(str), ((uqm) fbp.a(this.c)).a(), "spotify:search-autocomplete", null, 0, null, "TAP", "clear", (double) this.a.a());
        jlr.a(bgVar);
    }
}
