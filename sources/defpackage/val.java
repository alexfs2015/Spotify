package defpackage;

import java.nio.charset.Charset;

/* renamed from: val reason: default package */
public final class val implements van {
    private final jtz a;
    private final jlr b;
    private final uqm c;

    public val(jlr jlr, uqm uqm, jtz jtz) {
        this.b = (jlr) fbp.a(jlr);
        this.c = (uqm) fbp.a(uqm);
        this.a = (jtz) fbp.a(jtz);
    }

    public final void a(String str, int i) {
        jlr jlr = this.b;
        String str2 = "spotify:search-trending";
        String str3 = "hit";
        String str4 = "fill";
        bg bgVar = new bg(null, ((uqm) fbp.a(this.c)).a(), str2, null, (long) i, String.format("spotify:search:%s", new Object[]{gck.a(str, Charset.defaultCharset())}), str3, str4, (double) this.a.a());
        jlr.a(bgVar);
    }
}
