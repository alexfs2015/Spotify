package defpackage;

/* renamed from: uhx reason: default package */
public final class uhx implements uhz {
    private final gkq a;
    private final jtz b;
    private final jlr c;
    private final sso d;

    public uhx(jtz jtz, jlr jlr, gkq gkq, sso sso) {
        this.b = jtz;
        this.c = jlr;
        this.a = gkq;
        this.d = sso;
    }

    private void a(String str, int i, String str2, String str3) {
        jlr jlr = this.c;
        String str4 = str;
        String str5 = str3;
        bg bgVar = new bg(null, this.a.a(), this.d.toString(), str4, (long) i, str5, "hit", str2, (double) this.b.a());
        jlr.a(bgVar);
    }

    public final void a(String str, String str2, int i) {
        a(str2, i, "navigate-forward", str);
    }

    public final void b(String str, String str2, int i) {
        a(str2, i, "play-episode", str);
    }

    public final void c(String str, String str2, int i) {
        a(str2, i, "pause-episode", str);
    }

    public final void d(String str, String str2, int i) {
        a(str2, i, "download-episode", str);
    }

    public final void e(String str, String str2, int i) {
        a(str2, i, "remove-downloaded-episode", str);
    }

    public final void f(String str, String str2, int i) {
        a(str2, i, "open-context-menu", str);
    }

    public final void g(String str, String str2, int i) {
        a(str2, i, "mark-as-played", str);
    }

    public final void h(String str, String str2, int i) {
        a(str2, i, "share", str);
    }
}
