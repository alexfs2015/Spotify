package defpackage;

/* renamed from: lop reason: default package */
public final class lop {
    public final jlr a;
    public final String b;
    public final String c;
    public final jtz d;

    public lop(jlr jlr, jtz jtz, String str, String str2) {
        this.a = jlr;
        this.d = jtz;
        this.b = str;
        this.c = str2;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        jlr jlr = this.a;
        bg bgVar = new bg(null, "com.spotify.feature.explicit", this.c, "enable-explicit-onetrack", 0, this.b, str, str2, (double) this.d.a());
        jlr.a(bgVar);
    }
}
