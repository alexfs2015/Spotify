package defpackage;

/* renamed from: iuq reason: default package */
public final class iuq {
    final jlr a;
    final String b;
    String c;

    public iuq(jlr jlr, String str, String str2) {
        this.a = jlr;
        this.b = str;
        this.c = str2;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, int i, String str2) {
        jlr jlr = this.a;
        String str3 = str;
        String str4 = str2;
        bg bgVar = new bg(null, this.b, this.c, str3, (long) i, str4, "hit", null, (double) jtp.a.a());
        jlr.a(bgVar);
    }
}
